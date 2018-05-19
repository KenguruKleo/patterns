package patterns.factory.abstractFactory.pizza;

import patterns.factory.abstractFactory.ingredients.PizzaIngredientsFactory;

public class ClamPizzaChicagoStyle extends ClamPizza {
  public ClamPizzaChicagoStyle(PizzaIngredientsFactory ingredientsFactory) {
    super(ingredientsFactory);
    this.name = "Clam Pizza Chicago Style";
  }
}
