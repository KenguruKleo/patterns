package patterns.factory.factoryMethod.pizza;

public class CheesePizzaChicagoStyle extends CheesePizza {
  public CheesePizzaChicagoStyle() {
    this.name = "Cheese Pizza Chicago Style";
  }

  @Override
  public void cut() {
    System.out.println("Cut pizza in Chicago style - six pieces");
  }
}
