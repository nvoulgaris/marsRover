package com.nvoulgaris.marsrover;

public class MoveForwardCommand implements RoverMotionCommand {

  private Rover rover;

  public MoveForwardCommand(Rover rove) {
    this.rover = rover;
  }

  @Override
  public void execute() {
    throw new UnsupportedOperationException();
  }
}
