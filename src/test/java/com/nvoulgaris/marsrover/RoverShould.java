package com.nvoulgaris.marsrover;

import com.nvoulgaris.marsrover.states.RoverState;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoverShould {

  Position position;
  Rover rover;

  private void assertRoverFacingDirectionAndPosition(RoverState state, Position position) {
    assertThat(rover.getFacingState()).isEqualTo(state);
    assertThat(rover.getPosition()).isEqualTo(position);
  }

  @Before
  public void setUp() throws Exception {
    position = new Position(0, 0);
    rover = new Rover(position);
  }

  @Test
  public void moveForward() throws Exception {
    rover.moveForward();

    assertRoverFacingDirectionAndPosition(rover.getNorthState(), new Position(1,0));
  }

  @Test
  public void turnRight() throws Exception {
    rover.turnRight();

    assertRoverFacingDirectionAndPosition(rover.getEastState(), new Position(0,0));
  }

  @Test
  public void turnLeft() throws Exception {
    rover.turnLeft();

    assertRoverFacingDirectionAndPosition(rover.getWestState(), new Position(0, 0));
  }
}