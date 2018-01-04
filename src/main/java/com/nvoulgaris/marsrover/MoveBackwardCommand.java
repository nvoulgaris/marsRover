package com.nvoulgaris.marsrover;

public class MoveBackwardCommand extends RoverMotionCommand {

  private Rover rover;

  public MoveBackwardCommand(Rover rover) {
    this.rover = rover;
  }
}
