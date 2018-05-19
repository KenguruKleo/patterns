package patterns.strategy.behavior;

public class QuackMute implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
