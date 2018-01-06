package com.nvoulgaris.marsrover;

public class RemoteDriver {

  private CommandRepository commandRepository;

  public RemoteDriver(CommandRepository commandRepository) {
    this.commandRepository = commandRepository;
  }

  public void sendCommands(String commands) {
    for (char commandCode : commands.toCharArray()) {
      RoverMotionCommand command = commandRepository.getCommandByCode(commandCode);
      command.execute();
    }
  }
}
