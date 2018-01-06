package com.nvoulgaris.marsrover;

import com.nvoulgaris.marsrover.commands.MoveBackwardCommand;
import com.nvoulgaris.marsrover.commands.MoveForwardCommand;
import com.nvoulgaris.marsrover.commands.NoCommand;
import com.nvoulgaris.marsrover.commands.TurnLeftCommand;
import com.nvoulgaris.marsrover.commands.TurnRightCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandRepository {

  private Rover rover;
  private Map<Character,  RoverMotionCommand> commands;

  public CommandRepository(Rover rover) {
    this.rover = rover;
    initializeAvailableCommands();
  }

  public RoverMotionCommand getCommandByCode(char commandCode) {
    if (commandIsAvailable(commandCode)) {
      return retrieveCommandByCode(commandCode);
    }
    return new NoCommand();
  }

  public Map<Character, RoverMotionCommand> availableCommands() {
    return commands;
  }

  private void initializeAvailableCommands() {
    commands = new HashMap<>();

    commands.put('F', new MoveForwardCommand(rover));
    commands.put('B', new MoveBackwardCommand(rover));
    commands.put('R', new TurnRightCommand(rover));
    commands.put('L', new TurnLeftCommand(rover));
  }

  private boolean commandIsAvailable(char commandCode) {
    return commands.containsKey(commandCode);
  }

  private RoverMotionCommand retrieveCommandByCode(char commandCode) {
    return commands.get(commandCode);
  }
}
