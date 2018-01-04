package com.nvoulgaris.marsrover;

import java.util.List;

public class RemoteDriver {

  private Navigator navigator;

  public RemoteDriver(Navigator navigator) {
    this.navigator = navigator;
  }

  public void create(List<RoverMotionCommand> commands) {
    navigator.create(commands);
  }
}
