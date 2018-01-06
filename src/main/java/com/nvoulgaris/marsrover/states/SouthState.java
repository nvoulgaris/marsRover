package com.nvoulgaris.marsrover.states;

import com.nvoulgaris.marsrover.Rover;

public class SouthState implements RoverState {

  private Rover rover;

  public SouthState(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void moveForward() {
    rover.decrementX();
  }

  @Override
  public void moveBackward() {
    rover.incrementX();
  }

  @Override
  public void turnRight() {
    rover.setFacingState(rover.getWestState());
  }

  @Override
  public void turnLeft() {
    rover.setFacingState(rover.getEastState());
  }
}
