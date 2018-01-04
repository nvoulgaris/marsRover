package com.nvoulgaris.marsrover;

public class Rover {

  private int x;
  private int y;
  private String direction;

  public Rover(int x, int y, String direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public Position getCurrentPosition() {
    return new Position(x,  y);
  }

  public Position moveForward() {
    return new Position(++x,  ++y);
  }
}
