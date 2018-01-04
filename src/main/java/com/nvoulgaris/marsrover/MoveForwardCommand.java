package com.nvoulgaris.marsrover;

public class MoveForwardCommand implements RoverMotionCommand {

  private Rover rover;

  public MoveForwardCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void execute() {
    rover.moveForward();
  }
}
