package com.nvoulgaris.marsrover.states;

import com.nvoulgaris.marsrover.Rover;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class SouthStateShould {

  @Mock Rover rover;

  private SouthState state;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    state = new SouthState(rover);
  }

  @Test
  public void moveOneCellDownWhenCommandedToMoveForward() throws Exception {
    state.moveForward();

    verify(rover).decrementX();
  }

  @Test
  public void moveOneCellUpWhenCommandedToMoveBackward() throws Exception {
    state.moveBackward();

    verify(rover).incrementX();
  }

  @Test
  public void faceWestWhenCommandedToTurnRight() throws Exception {
    state.turnRight();

    verify(rover).setFacingState(rover.getWestState());
  }

  @Test
  public void faceEastWhenCommandedToTurnRight() throws Exception {
    state.turnLeft();

    verify(rover).setFacingState(rover.getEastState());
  }
}