package com.nvoulgaris.marsrover.acceptance;

import com.nvoulgaris.marsrover.CommandRepository;
import com.nvoulgaris.marsrover.Position;
import com.nvoulgaris.marsrover.RemoteDriver;
import com.nvoulgaris.marsrover.Rover;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigationFeature {

  Rover rover;
  RemoteDriver remoteDriver;
  CommandRepository commandRepository;

  private void moveTenCellsForward() {
    remoteDriver.sendCommands("FFFFFFFFFF");
  }

  private void turnRight() {
    remoteDriver.sendCommands("R");
  }

  @Before
  public void setUp() throws Exception {
    rover = new Rover(new Position(0, 0));
    commandRepository = new CommandRepository(rover);
    remoteDriver = new RemoteDriver(commandRepository);
  }

  @Test
  public void shouldBeAbleToNavigateOnTheGrid() throws Exception {
    remoteDriver.sendCommands("FFRFFLFB");

    Position position = rover.getPosition();

    assertThat(position).isEqualTo(new Position(2, 2));
  }

  @Test
  public void shouldWrapWhenReachingTheEndOfTheGrid() throws Exception {
    moveTenCellsForward();
    turnRight();
    moveTenCellsForward();
    turnRight();
    moveTenCellsForward();
    turnRight();
    moveTenCellsForward();
    turnRight();
    remoteDriver.sendCommands("FRF");

    Position position = rover.getPosition();

    assertThat(position).isEqualTo(new Position(1, 1));
  }
}
