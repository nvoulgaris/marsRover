package com.nvoulgaris.marsrover.states;

import com.nvoulgaris.marsrover.Rover;

public class WestState implements RoverState {

  private Rover rover;

  public WestState(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void moveForward() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void turnRight() {
    throw new UnsupportedOperationException();
  }
}
