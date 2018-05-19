package patterns.factory.factoryMethod.pizza;

public abstract class ClamPizza extends Pizza {
  public ClamPizza() {
    this.name = "Clam Pizza";
    dough = "Dough for Clam Pizza";
    sauce = "Sauce for Clam Pizza";
    toppings.add("Topping for Clam pizza");
  }
}
