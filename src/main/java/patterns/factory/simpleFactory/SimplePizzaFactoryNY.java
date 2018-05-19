package patterns.factory.simpleFactory;

import patterns.factory.simpleFactory.pizza.*;

public class SimplePizzaFactoryNY extends SimplePizzaFactory{
  public Pizza createPizza(String type) {
    Pizza pizza = null;

    if (type.equals("cheese")) {
      pizza = new CheesePizzaNYStyle();
    } else if (type.equals("pepperoni")) {
      pizza = new PepperoniPizzaNYStyle();
    } else if (type.equals("clam")) {
      pizza = new ClamPizzaNYStyle();
    } else if (type.equals("veggie")) {
      pizza = new VeggiePizzaNYStyle();
    }

    return pizza;
  }
}
