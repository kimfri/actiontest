package org.kimfri;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

  /**
   * What's the use of documenting this??.
   */
  private final Main main = new Main();

  /**
   * But why?.
   */
  private static final int ONE = 1;
  /**
   * But why?.
   */
  private static final int TWO = 2;
  /**
   * But why?.
   */
  private static final int THREE = 3;
  /**
   * But why?.
   */
  private static final int FOUR = 4;

  @ParameterizedTest
  @ValueSource(ints = {ONE, TWO, THREE, FOUR})
  void add(final int first) {
    final int actual = main.add(first, first + 1);
    final int expected = (first * 2) + 1;
    assertEquals(expected, actual);
  }
}
