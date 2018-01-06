package com.nvoulgaris.marsrover.states;

import com.nvoulgaris.marsrover.NorthState;
import com.nvoulgaris.marsrover.Rover;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class NorthStateShould {

  @Mock Rover rover;

  NorthState state;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    state = new NorthState(rover);
  }

  @Test
  public void moveOneCellUpWhenCommandedToMoveForward() throws Exception {
    state.moveForward();

    verify(rover).incrementX();
  }

  @Test
  public void moveOneCellDownWhenCommandedToMoveBackward() throws Exception {
    state.moveBackward();

    verify(rover).decrementX();
  }

  @Test
  public void faceEastWhenCommandedToTurnRight() throws Exception {
    state.turnRight();

    verify(rover).setFacingState(rover.getEastState());
  }

  @Test
  public void faceWestWhenCommandedToTurnRight() throws Exception {
    state.turnLeft();

    verify(rover).setFacingState(rover.getWestState());
  }
}