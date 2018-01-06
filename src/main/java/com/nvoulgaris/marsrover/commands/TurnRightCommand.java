package com.nvoulgaris.marsrover.commands;

import com.nvoulgaris.marsrover.Rover;

public class TurnRightCommand implements RoverMotionCommand {

  private Rover rover;

  public TurnRightCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void execute() {
    rover.turnRight();
  }
}
