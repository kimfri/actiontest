package org.kimfri;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

  private final Main main = new Main();
  private final static int ONE = 1;
  private final static int TWO = 2;
  private final static int THREE = 3;
  private final static int FOUR = 4;

  @ParameterizedTest
  @ValueSource(ints = {ONE, TWO, THREE, FOUR})
  void add(final int first) {
    final int actual = main.add(first, first + 1);
    final int expected = (first * 2) + 1;
    assertEquals(expected, actual);
  }
}
