package com.nvoulgaris.marsrover.acceptance;

import com.nvoulgaris.marsrover.Navigator;
import com.nvoulgaris.marsrover.Position;
import com.nvoulgaris.marsrover.RemoteDriver;
import com.nvoulgaris.marsrover.Rover;
import com.nvoulgaris.marsrover.RoverMotionCommand;
import com.nvoulgaris.marsrover.commands.MoveBackwardCommand;
import com.nvoulgaris.marsrover.commands.MoveForwardCommand;
import com.nvoulgaris.marsrover.commands.TurnLeftCommand;
import com.nvoulgaris.marsrover.commands.TurnRightCommand;
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
    rover = new Rover(new Position(0, 0));
    navigator = new Navigator();
    remoteDriver = new RemoteDriver(navigator);
  }

  @Test
  public void shouldBeAbleToNavigateOnTheGrid() throws Exception {
    remoteDriver.create(commandsToGetTwoCellsNorthAndTwoCellsEast());

    navigator.executeCommands();
    Position position = rover.getPosition();

    assertThat(position).isEqualTo(new Position(2, 2));
  }
}
