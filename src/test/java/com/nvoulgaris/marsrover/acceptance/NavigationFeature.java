package com.nvoulgaris.marsrover.acceptance;

import com.nvoulgaris.marsrover.MoveBackwardCommand;
import com.nvoulgaris.marsrover.MoveForwardCommand;
import com.nvoulgaris.marsrover.Navigator;
import com.nvoulgaris.marsrover.Position;
import com.nvoulgaris.marsrover.RemoteDriver;
import com.nvoulgaris.marsrover.Rover;
import com.nvoulgaris.marsrover.RoverMotionCommand;
import com.nvoulgaris.marsrover.TurnLeftCommand;
import com.nvoulgaris.marsrover.TurnRightCommand;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigationFeature {

  Rover rover;
  Navigator navigator;
  RemoteDriver remoteDriver;

  private ArrayList<RoverMotionCommand> commandsToGetTwoCellsNorthAndTwoCellsEast() {
    ArrayList<RoverMotionCommand> commands = new ArrayList<>();
    commands.add(new MoveForwardCommand(rover));
    commands.add(new MoveForwardCommand(rover));
    commands.add(new TurnRightCommand(rover));
    commands.add(new MoveForwardCommand(rover));
    commands.add(new MoveForwardCommand(rover));
    commands.add(new TurnLeftCommand(rover));
    commands.add(new MoveForwardCommand(rover));
    commands.add(new MoveBackwardCommand(rover));
    return commands;
  }

  @Before
  public void setUp() throws Exception {
    navigator = new Navigator(new Rover(0, 0, "N"));
    remoteDriver = new RemoteDriver(navigator);
  }

  @Test
  public void shouldBeAbleToNavigateOnTheGrid() throws Exception {
    remoteDriver.create(commandsToGetTwoCellsNorthAndTwoCellsEast());

    Position position = navigator.receiveCommands();

    assertThat(position).isEqualTo(new Position(2, 2));
  }
}
