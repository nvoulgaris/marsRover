package com.nvoulgaris.marsrover;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class NorthStateShould {

  @Mock Position position;

  NorthState state;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    state = new NorthState(position);
  }

  @Test
  public void moveOneCellUpWhenCommandedToMoveForward() throws Exception {
    state.moveForward();

    verify(position).incrementX();
  }
}