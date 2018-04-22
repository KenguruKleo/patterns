package patterns.strategy;

import patterns.strategy.behavior.FlyRocketPowered;
import patterns.strategy.duck.Duck;
import patterns.strategy.duck.MallardDuck;
import patterns.strategy.duck.ModelDuck;

public class mainStrategy {
  public static void main(String[] args){
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
