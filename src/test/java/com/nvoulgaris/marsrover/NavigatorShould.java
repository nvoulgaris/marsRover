package com.nvoulgaris.marsrover;

import com.nvoulgaris.marsrover.commands.MoveForwardCommand;
import com.nvoulgaris.marsrover.commands.TurnLeftCommand;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

public class NavigatorShould {

  @Mock
  MoveForwardCommand moveForwardCommand;
  @Mock
  TurnLeftCommand turnLeftCommand;

  private List<RoverMotionCommand> commands;
  private Navigator navigator;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    commands = new ArrayList<>();
    navigator = new Navigator();
  }

  @Test
  public void executeCreatedCommands() throws Exception {
    commands.add(moveForwardCommand);
    commands.add(turnLeftCommand);
    navigator.create(commands);

    navigator.executeCommands();

    InOrder inOrder = Mockito.inOrder(moveForwardCommand, turnLeftCommand);
    inOrder.verify(moveForwardCommand).execute();
    inOrder.verify(turnLeftCommand).execute();
  }
}