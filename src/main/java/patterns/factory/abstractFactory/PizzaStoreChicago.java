package patterns.factory.abstractFactory;

import patterns.factory.abstractFactory.ingredients.PizzaIngredientFactoryChicago;
import patterns.factory.abstractFactory.ingredients.PizzaIngredientsFactory;
import patterns.factory.abstractFactory.pizza.*;

public class PizzaStoreChicago extends PizzaStore {
  PizzaIngredientsFactory ingredientsFactory;

  public PizzaStoreChicago() {
    this.ingredientsFactory = new PizzaIngredientFactoryChicago();
  }

  @Override
  Pizza createPizza(String type) {
    Pizza pizza = null;

    if (type.equals("cheese")) {
      pizza = new CheesePizzaChicagoStyle(ingredientsFactory);
    } else if (type.equals("clam")) {
      pizza = new ClamPizzaChicagoStyle(ingredientsFactory);
    }

    return pizza;
  }
}
