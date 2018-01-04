package com.nvoulgaris.marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoverShould {

  private static final int INITIAL_X = 0;
  private static final int INITIAL_Y = 0;
  private static final String INITIAL_DIRECTION = "N";
  private static final int ONE_CELL = 1;

  private Rover rover;

  @Before
  public void setUp() throws Exception {
    rover = new Rover(INITIAL_X, INITIAL_Y, INITIAL_DIRECTION);
  }

  @Test
  public void moveOneCellForwardWhenCommandedToMoveForward() throws Exception {
    Position oneCellForward = new Position(
        INITIAL_X + ONE_CELL,
        INITIAL_Y + ONE_CELL
    );

    rover.moveForward();

    Position roverPosition = rover.getCurrentPosition();
    assertThat(roverPosition).isEqualTo(oneCellForward);
  }
}