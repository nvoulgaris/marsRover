package com.nvoulgaris.marsrover.commands;

import com.nvoulgaris.marsrover.Rover;

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
