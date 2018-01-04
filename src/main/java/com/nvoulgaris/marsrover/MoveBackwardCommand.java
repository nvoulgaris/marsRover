package com.nvoulgaris.marsrover;

public class MoveBackwardCommand implements RoverMotionCommand {

  private Rover rover;

  public MoveBackwardCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void execute() {
    throw new UnsupportedOperationException();
  }
}
