package com.nvoulgaris.marsrover;

public class TurnLeftCommand implements RoverMotionCommand {

  private Rover rover;

  public TurnLeftCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void execute() {
    throw new UnsupportedOperationException();
  }
}
