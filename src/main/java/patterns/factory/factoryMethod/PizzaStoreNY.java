package patterns.factory.factoryMethod;

import patterns.factory.factoryMethod.pizza.*;

public class PizzaStoreNY extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
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
