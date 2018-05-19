package patterns.factory.simpleFactory;

import patterns.factory.simpleFactory.pizza.*;

public class SimplePizzaFactoryChicago extends SimplePizzaFactory{
  public Pizza createPizza(String type) {
    Pizza pizza = null;

    if (type.equals("cheese")) {
      pizza = new CheesePizzaChicagoStyle();
    } else if (type.equals("pepperoni")) {
      pizza = new PepperoniPizzaChicagoStyle();
    } else if (type.equals("clam")) {
      pizza = new ClamPizzaChicagoStyle();
    } else if (type.equals("veggie")) {
      pizza = new VeggiePizzaChicagoStyle();
    }

    return pizza;
  }
}
