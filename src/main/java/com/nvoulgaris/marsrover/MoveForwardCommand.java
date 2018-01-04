package com.nvoulgaris.marsrover;

public class MoveForwardCommand extends RoverMotionCommand {

  private Rover rover;

  public MoveForwardCommand(Rover rove) {
    this.rover = rover;
  }
}
