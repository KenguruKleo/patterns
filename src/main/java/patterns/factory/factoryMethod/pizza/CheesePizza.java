package patterns.factory.factoryMethod.pizza;

public abstract class CheesePizza extends Pizza {
  public CheesePizza() {
    name = "Cheese Pizza";
    dough = "Dough for Cheese Pizza";
    sauce = "Sauce for Cheese Pizza";
    toppings.add("Topping for cheese pizza");
  }
}
