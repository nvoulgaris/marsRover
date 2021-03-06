package com.nvoulgaris.marsrover.states;

import com.nvoulgaris.marsrover.Rover;

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
  public void moveBackward() {
    rover.decrementX();
  }

  @Override
  public void turnRight() {
    rover.setFacingState(rover.getEastState());
  }

  @Override
  public void turnLeft() {
    rover.setFacingState(rover.getWestState());
  }
}
