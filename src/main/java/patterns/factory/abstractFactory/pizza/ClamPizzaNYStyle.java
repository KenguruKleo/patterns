package patterns.factory.abstractFactory.pizza;

import patterns.factory.abstractFactory.ingredients.PizzaIngredientsFactory;

public class ClamPizzaNYStyle extends ClamPizza {
  public ClamPizzaNYStyle(PizzaIngredientsFactory ingredientsFactory) {
    super(ingredientsFactory);
    this.name = "Clam Pizza NY Style";
  }

  @Override
  public void cut() {
    System.out.println("Cut pizza in NY style - four pieces");
  }
}
