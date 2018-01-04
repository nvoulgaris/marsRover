package com.nvoulgaris.marsrover.acceptance;

import com.nvoulgaris.marsrover.MoveBackwardCommand;
import com.nvoulgaris.marsrover.MoveForwardCommand;
import com.nvoulgaris.marsrover.Navigator;
import com.nvoulgaris.marsrover.Position;
import com.nvoulgaris.marsrover.Rover;
import com.nvoulgaris.marsrover.RoverCommand;
import com.nvoulgaris.marsrover.TurnLeftCommand;
import com.nvoulgaris.marsrover.TurnRightCommand;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigationFeature {

  @Test
  public void shouldBeAbleToNavigateOnTheGrid() throws Exception {
    Navigator navigator = new Navigator(new Rover(0, 0, "N"));
    ArrayList<RoverCommand> commands = new ArrayList<>();
    commands.add(new MoveForwardCommand());
    commands.add(new MoveForwardCommand());
    commands.add(new TurnRightCommand());
    commands.add(new MoveForwardCommand());
    commands.add(new MoveForwardCommand());
    commands.add(new TurnLeftCommand());
    commands.add(new MoveForwardCommand());
    commands.add(new MoveBackwardCommand());

    Position position = navigator.execute(commands);

    assertThat(position).isEqualTo(new Position(2, 2));
  }
}
