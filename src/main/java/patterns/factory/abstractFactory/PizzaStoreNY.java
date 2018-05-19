package patterns.factory.abstractFactory;

import patterns.factory.abstractFactory.ingredients.PizzaIngredientFactoryChicago;
import patterns.factory.abstractFactory.ingredients.PizzaIngredientsFactory;
import patterns.factory.abstractFactory.pizza.*;

public class PizzaStoreNY extends PizzaStore {
  PizzaIngredientsFactory ingredientsFactory;

  public PizzaStoreNY() {
    this.ingredientsFactory = new PizzaIngredientFactoryChicago();
  }

  @Override
  Pizza createPizza(String type) {
    Pizza pizza = null;

    if (type.equals("cheese")) {
      pizza = new CheesePizzaNYStyle(ingredientsFactory);
    } else if (type.equals("clam")) {
      pizza = new ClamPizzaNYStyle(ingredientsFactory);
    }

    return pizza;
  }
}
