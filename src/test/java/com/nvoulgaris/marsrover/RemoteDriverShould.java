package com.nvoulgaris.marsrover;

import com.nvoulgaris.marsrover.commands.MoveBackwardCommand;
import com.nvoulgaris.marsrover.commands.MoveForwardCommand;
import com.nvoulgaris.marsrover.commands.TurnLeftCommand;
import com.nvoulgaris.marsrover.commands.TurnRightCommand;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class RemoteDriverShould {

  @Mock Rover rover;
  @Mock MoveForwardCommand moveForwardCommand;
  @Mock MoveBackwardCommand moveBackwardCommand;
  @Mock TurnRightCommand turnRightCommand;
  @Mock TurnLeftCommand turnLeftCommand;
  @Mock CommandRepository commandRepository;

  private RemoteDriver remoteDriver;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    remoteDriver = new RemoteDriver(commandRepository);
  }

  @Test
  public void sendRoverMotionCommands() throws Exception {
    when(commandRepository.getCommandByCode('F')).thenReturn(moveForwardCommand);
    when(commandRepository.getCommandByCode('B')).thenReturn(moveBackwardCommand);
    when(commandRepository.getCommandByCode('R')).thenReturn(turnRightCommand);
    when(commandRepository.getCommandByCode('L')).thenReturn(turnLeftCommand);

    remoteDriver.sendCommands("FBRL");

    InOrder repositoryInOrder = Mockito.inOrder(commandRepository);
    repositoryInOrder.verify(commandRepository).getCommandByCode('F');
    repositoryInOrder.verify(commandRepository).getCommandByCode('B');
    repositoryInOrder.verify(commandRepository).getCommandByCode('R');
    repositoryInOrder.verify(commandRepository).getCommandByCode('L');

    InOrder commandsInOrder = Mockito.inOrder(moveForwardCommand, moveBackwardCommand, turnRightCommand, turnLeftCommand);
    commandsInOrder.verify(moveForwardCommand).execute();
    commandsInOrder.verify(moveBackwardCommand).execute();
    commandsInOrder.verify(turnRightCommand).execute();
    commandsInOrder.verify(turnLeftCommand).execute();
  }
}