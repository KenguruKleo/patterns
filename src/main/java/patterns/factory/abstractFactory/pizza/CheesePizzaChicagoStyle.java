package patterns.factory.abstractFactory.pizza;

import patterns.factory.abstractFactory.ingredients.PizzaIngredientsFactory;

public class CheesePizzaChicagoStyle extends CheesePizza {
  public CheesePizzaChicagoStyle(PizzaIngredientsFactory ingredientsFactory) {
    super(ingredientsFactory);
    this.name = "Cheese Pizza Chicago Style";
  }

  @Override
  public void cut() {
    System.out.println("Cut pizza in Chicago style - six pieces");
  }
}
