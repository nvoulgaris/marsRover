package com.nvoulgaris.marsrover;

public class Position {

  public static final int MAX_X = 9;
  public static final int MIN_X = -9;
  public static final int MAX_Y = 9;
  public static final int MIN_Y = -9;
  private static final int ONE_CELL = 1;
  private final int X_AXIS_SIZE;
  private final int Y_AXIS_SIZE;

  private int x;
  private int y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
    X_AXIS_SIZE = MAX_X + 1;
    Y_AXIS_SIZE = MAX_Y + 1;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public Position incrementX() {
    x = (x + ONE_CELL) % X_AXIS_SIZE;
    return this;
  }

  public Position decrementX() {
    x = (x - ONE_CELL) % X_AXIS_SIZE;
    return this;
  }

  public Position incrementY() {
    y = (y + ONE_CELL) % Y_AXIS_SIZE;
    return this;
  }

  public Position decrementY() {
    y = (y - ONE_CELL) % Y_AXIS_SIZE;
    return this;
  }

  @Override
  public String toString() {
    return "Position{" + "x=" + x + ", y=" + y + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Position position = (Position) o;

    if (x != position.x) {
      return false;
    }
    return y == position.y;
  }

  @Override
  public int hashCode() {
    int result = x;
    result = 31 * result + y;
    return result;
  }
}
