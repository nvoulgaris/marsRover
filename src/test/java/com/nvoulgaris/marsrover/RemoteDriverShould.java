package com.nvoulgaris.marsrover;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;

public class RemoteDriverShould {

  @Mock Navigator navigator;
  @Mock MoveForwardCommand moveForwardCommand;
  @Mock TurnLeftCommand turnLeftCommand;
  List<RoverMotionCommand> commands;
  RemoteDriver remoteDriver;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    remoteDriver = new RemoteDriver(navigator);
    commands = new ArrayList<>();
  }

  @Test
  public void createRoverMotionCommands() throws Exception {
    commands.add(moveForwardCommand);
    commands.add(turnLeftCommand);

    remoteDriver.create(commands);

    verify(navigator).create(commands);
  }
}