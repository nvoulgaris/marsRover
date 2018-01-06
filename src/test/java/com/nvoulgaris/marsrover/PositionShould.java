package com.nvoulgaris.marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionShould {

  private static final int INITIAL_X = 0;
  private static final int INITIAL_Y = 0;
  private static final int ONE = 1;
  private Position position;

  @Before
  public void setUp() throws Exception {
    position = new Position(INITIAL_X, INITIAL_Y);
  }

  @Test
  public void incrementX() throws Exception {
    position = position.incrementX();

    assertThat(position.getX()).isEqualTo(INITIAL_X + ONE);
  }

  @Test
  public void decrementX() throws Exception {
    position = position.decrementX();

    assertThat(position.getX()).isEqualTo(INITIAL_X - ONE);
  }

  @Test
  public void incrementY() throws Exception {
    position = position.incrementY();

    assertThat(position.getY()).isEqualTo(INITIAL_Y + ONE);
  }

  @Test
  public void decrementY() throws Exception {
    position = position.decrementY();

    assertThat(position.getY()).isEqualTo(INITIAL_Y - ONE);
  }
}