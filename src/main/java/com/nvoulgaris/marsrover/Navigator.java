package com.nvoulgaris.marsrover;

import java.util.List;

public class Navigator {

  private Rover rover;

  public Navigator(Rover rover) {
    this.rover = rover;
  }

  public Position receiveCommands() {
    throw new UnsupportedOperationException();
  }

  public void create(List<RoverMotionCommand> commands) {
    throw new UnsupportedOperationException();
  }
}
