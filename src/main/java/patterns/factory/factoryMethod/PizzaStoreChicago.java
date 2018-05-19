package patterns.factory.factoryMethod;

import patterns.factory.factoryMethod.pizza.*;

public class PizzaStoreChicago extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
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
