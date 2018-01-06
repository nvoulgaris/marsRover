package com.nvoulgaris.marsrover.commands;

import com.nvoulgaris.marsrover.Rover;

public class TurnLeftCommand implements RoverMotionCommand {

  private Rover rover;

  public TurnLeftCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void execute() {
    rover.turnLeft();
  }
}
