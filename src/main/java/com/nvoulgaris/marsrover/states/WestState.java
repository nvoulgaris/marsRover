package com.nvoulgaris.marsrover.states;

import com.nvoulgaris.marsrover.Rover;

public class WestState implements RoverState {

  private Rover rover;

  public WestState(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void moveForward() {
    rover.decrementY();
  }

  @Override
  public void moveBackward() {
    rover.incrementY();
  }

  @Override
  public void turnRight() {
    rover.setFacingState(rover.getNorthState());
  }

  @Override
  public void turnLeft() {
    rover.setFacingState(rover.getSouthState());
  }
}
