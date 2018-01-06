package com.nvoulgaris.marsrover.commands;

import com.nvoulgaris.marsrover.Rover;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class MoveForwardCommandShould {

  @Mock
  Rover rover;

  private MoveForwardCommand moveForwardCommand;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    moveForwardCommand = new MoveForwardCommand(rover);
  }

  @Test
  public void moveTheRoverOneCellForward() throws Exception {
    moveForwardCommand.execute();

    verify(rover).moveForward();
  }
}