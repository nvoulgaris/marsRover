package com.nvoulgaris.marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoverShould {

  Position position;
  Rover rover;

  @Before
  public void setUp() throws Exception {
    position = new Position(0, 0);
    rover = new Rover(position);
  }

  @Test
  public void moveForward() throws Exception {
    rover.moveForward();

    assertThat(rover.getFacingState()).isEqualTo(rover.getNorthState());
    assertThat(rover.getPosition()).isEqualTo(new Position(1,0));
  }

  @Test
  public void turnRight() throws Exception {
    rover.turnRight();

    assertThat(rover.getFacingState()).isEqualTo(rover.getEastState());
  }
}