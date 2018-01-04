package com.nvoulgaris.marsrover;

import java.util.ArrayList;
import java.util.List;

public class Navigator {

  private List<RoverMotionCommand> commands;

  public Navigator() {
    this.commands = new ArrayList<>();
  }

  public void create(List<RoverMotionCommand> commands) {
    this.commands.addAll(commands);
  }

  public void executeCommands() {
    this.commands.forEach(c -> c.execute());
  }
}
