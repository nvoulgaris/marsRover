package com.nvoulgaris.marsrover.commands;

import com.nvoulgaris.marsrover.Rover;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class MoveBackwardCommandShould {

  @Mock Rover rover;

  private MoveBackwardCommand moveBackwardCommand;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    moveBackwardCommand = new MoveBackwardCommand(rover);
  }

  @Test
  public void moveTheRoverOneCellBackward() throws Exception {
    moveBackwardCommand.execute();

    verify(rover).moveBackward();
  }
}