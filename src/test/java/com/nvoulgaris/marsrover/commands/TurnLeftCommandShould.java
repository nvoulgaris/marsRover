package com.nvoulgaris.marsrover.commands;

import com.nvoulgaris.marsrover.Rover;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class TurnLeftCommandShould {

  @Mock Rover rover;

  private TurnLeftCommand turnLeftCommand;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    turnLeftCommand = new TurnLeftCommand(rover);
  }

  @Test
  public void turnTheRoverToFaceToItsLeft() throws Exception {
    turnLeftCommand.execute();

    verify(rover).turnLeft();
  }
}