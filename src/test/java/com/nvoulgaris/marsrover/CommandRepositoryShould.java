package com.nvoulgaris.marsrover;

import com.nvoulgaris.marsrover.commands.MoveBackwardCommand;
import com.nvoulgaris.marsrover.commands.MoveForwardCommand;
import com.nvoulgaris.marsrover.commands.NoCommand;
import com.nvoulgaris.marsrover.commands.RoverMotionCommand;
import com.nvoulgaris.marsrover.commands.TurnLeftCommand;
import com.nvoulgaris.marsrover.commands.TurnRightCommand;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommandRepositoryShould {

  private static final int AVAILABLE_COMMANDS_COUNT = 4;

  private CommandRepository commandRepository;

  @Before
  public void setUp() throws Exception {
    commandRepository = new CommandRepository(new Rover(new Position(0, 0)));
  }

  @Test
  public void containAllAvailableCommands() throws Exception {
    assertThat(commandRepository.availableCommands().size()).isEqualTo(AVAILABLE_COMMANDS_COUNT);
  }

  @Test
  public void getCommandByCodeWhenCodeIsValid() throws Exception {
    RoverMotionCommand command = commandRepository.getCommandByCode('F');
    assertThat(command).isInstanceOf(MoveForwardCommand.class);

    command = commandRepository.getCommandByCode('B');
    assertThat(command).isInstanceOf(MoveBackwardCommand.class);

    command = commandRepository.getCommandByCode('R');
    assertThat(command).isInstanceOf(TurnRightCommand.class);

    command = commandRepository.getCommandByCode('L');
    assertThat(command).isInstanceOf(TurnLeftCommand.class);
  }

  @Test
  public void returnsNoCommandWhenCodeIsInvalid() throws Exception {
    RoverMotionCommand command = commandRepository.getCommandByCode('I');
    assertThat(command).isInstanceOf(NoCommand.class);
  }
}