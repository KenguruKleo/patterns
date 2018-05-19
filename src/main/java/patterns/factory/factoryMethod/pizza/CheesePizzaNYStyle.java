package patterns.factory.factoryMethod.pizza;

public class CheesePizzaNYStyle extends CheesePizza {
  public CheesePizzaNYStyle() {
    this.name = "Cheese Pizza NY Style";
  }

  @Override
  public void cut() {
    System.out.println("Cut pizza in NY style - four pieces");
  }
}
