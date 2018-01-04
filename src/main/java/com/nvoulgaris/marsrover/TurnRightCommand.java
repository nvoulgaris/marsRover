package com.nvoulgaris.marsrover;

public class TurnRightCommand extends RoverMotionCommand {

  private Rover rover;

  public TurnRightCommand(Rover rover) {
    this.rover = rover;
  }
}
