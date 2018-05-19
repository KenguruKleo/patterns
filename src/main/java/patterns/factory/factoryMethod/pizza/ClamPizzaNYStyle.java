package patterns.factory.factoryMethod.pizza;

public class ClamPizzaNYStyle extends ClamPizza {
  public ClamPizzaNYStyle() {
    this.name = "Clam Pizza NY Style";
  }

  @Override
  public void cut() {
    System.out.println("Cut pizza in NY style - four pieces");
  }
}
