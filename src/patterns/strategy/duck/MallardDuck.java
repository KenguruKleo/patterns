package patterns.strategy.duck;
import patterns.strategy.behavior.FlyWithWings;
import patterns.strategy.behavior.Quack;

public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
