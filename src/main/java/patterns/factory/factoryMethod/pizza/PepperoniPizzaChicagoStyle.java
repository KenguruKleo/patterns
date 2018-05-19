package patterns.factory.factoryMethod.pizza;

public class PepperoniPizzaChicagoStyle extends PepperoniPizza {
  public PepperoniPizzaChicagoStyle() {
    this.name = "Pepperoni Pizza Chicago Style";
  }

  @Override
  public void cut() {
    System.out.println("Cut pizza in Chicago style - six pieces");
  }
}
