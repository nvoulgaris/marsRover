package com.nvoulgaris.marsrover;

import com.nvoulgaris.marsrover.states.RoverState;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class RoverShould {

  @Mock RoverState roverState;

  private Rover rover;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    rover = new Rover(roverState);
  }

  @Test
  public void moveForward() throws Exception {
    rover.moveForward();

    verify(roverState).moveForward();
  }
}