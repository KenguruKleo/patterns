package patterns.factory.abstractFactory.pizza;

import patterns.factory.abstractFactory.ingredients.PizzaIngredientsFactory;

public abstract class CheesePizza extends Pizza {
  PizzaIngredientsFactory ingredientsFactory;

  public CheesePizza(PizzaIngredientsFactory ingredientsFactory) {
    this.ingredientsFactory = ingredientsFactory;
    name = "Cheese Pizza";
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
