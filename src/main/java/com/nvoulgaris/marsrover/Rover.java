package com.nvoulgaris.marsrover;

import com.nvoulgaris.marsrover.states.RoverState;

public class Rover {

  private Position position;
  private RoverState state;

  public Rover(RoverState facingState) {
    this.state = facingState;
  }

  public Position getPosition() {
    return this.position;
  }

  public void moveForward() {
    state.moveForward();
  }
}
