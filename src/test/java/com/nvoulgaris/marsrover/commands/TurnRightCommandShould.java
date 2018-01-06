package com.nvoulgaris.marsrover.commands;

import com.nvoulgaris.marsrover.Rover;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class TurnRightCommandShould {

  @Mock Rover rover;

  private TurnRightCommand turnRightCommand;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    turnRightCommand = new TurnRightCommand(rover);
  }

  @Test
  public void turnTheRoverToFaceToItsRight() throws Exception {
    turnRightCommand.execute();

    verify(rover).turnRight();
  }
}