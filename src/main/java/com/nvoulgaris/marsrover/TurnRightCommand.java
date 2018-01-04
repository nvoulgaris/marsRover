package com.nvoulgaris.marsrover;

public class TurnRightCommand implements RoverMotionCommand {

  private Rover rover;

  public TurnRightCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void execute() {
    throw new UnsupportedOperationException();
  }
}
