package patterns.factory.simpleFactory;

import patterns.factory.simpleFactory.pizza.*;

public abstract class SimplePizzaFactory {
  public abstract Pizza createPizza(String type);
}
