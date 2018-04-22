package patterns.strategy.behavior;

public class QuackSqueak implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
