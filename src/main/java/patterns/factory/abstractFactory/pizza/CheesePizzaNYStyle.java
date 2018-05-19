package patterns.factory.abstractFactory.pizza;

import patterns.factory.abstractFactory.ingredients.PizzaIngredientsFactory;

public class CheesePizzaNYStyle extends CheesePizza {
  public CheesePizzaNYStyle(PizzaIngredientsFactory ingredientsFactory) {
    super(ingredientsFactory);
    this.name = "Cheese Pizza NY Style";
  }

  @Override
  public void cut() {
    System.out.println("Cut pizza in NY style - four pieces");
  }
}
