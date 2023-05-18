package org.kimfri;

public class Main {
  /**
   * This is the main method, and it will start the project.
   *
   * @param args String[] containing all args from cmd-line
   */
  public static void main(final String[] args) {
    Main main = new Main();
    main.firstMethod();
  }

  final void firstMethod() {
    add(1, 2);
  }

  /**
   * Method will add first and second argument.
   * @param first int
   * @param second int
   * @return the calculated value of first + second
   */
  int add(final int first, final int second) {
    return first + second;
  }
}
