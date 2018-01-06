package com.nvoulgaris.marsrover;

import com.nvoulgaris.marsrover.states.RoverState;

public class NorthState implements RoverState {

  private Rover rover;

  public NorthState(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void moveForward() {
    rover.incrementX();
  }

  @Override
  public void turnRight() {
    rover.setFacingState(rover.getEastState());
  }
}
