package com.nvoulgaris.marsrover;

import com.nvoulgaris.marsrover.states.EastState;
import com.nvoulgaris.marsrover.states.RoverState;
import com.nvoulgaris.marsrover.states.SouthState;
import com.nvoulgaris.marsrover.states.WestState;

public class Rover {

  private final RoverState NORTH_STATE;
  private final RoverState EAST_STATE;
  private final RoverState SOUTH_STATE;
  private final RoverState WEST_STATE;

  private Position position;
  private RoverState facingState;

  public Rover(Position position) {
    this.NORTH_STATE = new NorthState(this);
    this.EAST_STATE = new EastState(this);
    this.SOUTH_STATE = new SouthState(this);
    this.WEST_STATE = new WestState(this);

    this.facingState = getNorthState();
    this.position = position;
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public RoverState getFacingState() {
    return facingState;
  }

  public void setFacingState(RoverState facingState) {
    this.facingState = facingState;
  }

  public void moveForward() {
    facingState.moveForward();
  }

  public void moveBackward() {
    facingState.moveBackward();
  }

  public void turnRight() {
    facingState.turnRight();
  }

  public void turnLeft() {
    facingState.turnLeft();
  }

  public RoverState getNorthState() {
    return NORTH_STATE;
  }

  public RoverState getEastState() {
    return EAST_STATE;
  }

  public RoverState getSouthState() {
    return SOUTH_STATE;
  }

  public RoverState getWestState() {
    return WEST_STATE;
  }

  public void incrementX() {
    this.position.incrementX();
  }

  public void decrementX() {
    this.position.decrementX();
  }

  public void incrementY() {
    this.position.incrementY();
  }

  public void decrementY() {
    this.position.decrementY();
  }
}
