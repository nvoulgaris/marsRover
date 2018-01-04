package com.nvoulgaris.marsrover;

public class TurnLeftCommand extends RoverMotionCommand {

  private Rover rover;

  public TurnLeftCommand(Rover rover) {
    this.rover = rover;
  }
}
