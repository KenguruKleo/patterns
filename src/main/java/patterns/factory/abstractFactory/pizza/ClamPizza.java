package patterns.factory.abstractFactory.pizza;

import patterns.factory.abstractFactory.ingredients.PizzaIngredientsFactory;

public abstract class ClamPizza extends Pizza {
  PizzaIngredientsFactory ingredientsFactory;

  public ClamPizza(PizzaIngredientsFactory ingredientsFactory) {
    this.ingredientsFactory = ingredientsFactory;
    name = "Clam Pizza";
  }

  @Override
  public void prepare() {
    System.out.println("Prepare pizza: " + getName());
    dough = ingredientsFactory.createDough();
    sauce = ingredientsFactory.createSauce();
    cheese = ingredientsFactory.createCheese();
    clam = ingredientsFactory.createClam();

    System.out.println("Tossing dough: " + getDough());
    System.out.println("Adding sauce: " + getSauce());
  }
}
