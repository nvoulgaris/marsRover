package com.nvoulgaris.marsrover.states;

import com.nvoulgaris.marsrover.Rover;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class EastStateShould {

  @Mock Rover rover;
  private EastState state;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    state = new EastState(rover);
  }

  @Test
  public void moveOneCellRightWhenCommandedToMoveForward() throws Exception {
    state.moveForward();

    verify(rover).incrementY();
  }

  @Test
  public void moveOneCellLeftWhenCommandedToMoveBackward() throws Exception {
    state.moveBackward();

    verify(rover).decrementY();
  }

  @Test
  public void faceSouthWhenCommandedToTurnRight() throws Exception {
    state.turnRight();

    verify(rover).setFacingState(rover.getSouthState());
  }

  @Test
  public void faceNorthWhenCommandedToTurnRight() throws Exception {
    state.turnLeft();

    verify(rover).setFacingState(rover.getNorthState());
  }
}