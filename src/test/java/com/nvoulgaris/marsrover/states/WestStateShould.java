package com.nvoulgaris.marsrover.states;

import com.nvoulgaris.marsrover.Rover;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class WestStateShould {

  @Mock Rover rover;
  private WestState state;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    state = new WestState(rover);
  }

  @Test
  public void moveOneCellLeftWhenCommandedToMoveForward() throws Exception {
    state.moveForward();

    verify(rover).decrementY();
  }

  @Test
  public void moveOneCellRightWhenCommandedToMoveBackward() throws Exception {
    state.moveBackward();

    verify(rover).incrementY();
  }

  @Test
  public void faceNorthWhenCommandedToTurnRight() throws Exception {
    state.turnRight();

    verify(rover).setFacingState(rover.getNorthState());
  }

  @Test
  public void faceSouthWhenCommandedToTurnRight() throws Exception {
    state.turnLeft();

    verify(rover).setFacingState(rover.getSouthState());
  }
}