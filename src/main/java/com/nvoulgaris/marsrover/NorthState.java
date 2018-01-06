package com.nvoulgaris.marsrover;

import com.nvoulgaris.marsrover.states.RoverState;

public class NorthState implements RoverState {

  private Position position;

  public NorthState(Position position) {
    this.position = position;
  }

  @Override
  public Position moveForward() {
    return position.incrementX();
  }
}
