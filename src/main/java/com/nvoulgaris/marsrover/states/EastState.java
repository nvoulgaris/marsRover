package com.nvoulgaris.marsrover.states;

import com.nvoulgaris.marsrover.Rover;

public class EastState implements RoverState {

  private Rover rover;

  public EastState(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void moveForward() {
    rover.incrementY();
  }

  @Override
  public void moveBackward() {
    rover.decrementY();
  }

  @Override
  public void turnRight() {
    rover.setFacingState(rover.getSouthState());
  }

  @Override
  public void turnLeft() {
    rover.setFacingState(rover.getNorthState());
  }
}
