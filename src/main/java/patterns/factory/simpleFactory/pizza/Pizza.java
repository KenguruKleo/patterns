package patterns.factory.simpleFactory.pizza;

public abstract class Pizza {
  String name = "Unknown Pizza";

  public String getName() {
    return this.name;
  }

  public void prepare() {
    System.out.println("Prepare pizza: " + getName());
  }

  public void bake() {
    System.out.println("Bake pizza: " + getName());
  }

  public void cut() {
    System.out.println("Cut pizza: " + getName());
  }

  public void box() {
    System.out.println("Box pizza: " + getName());
  }

}
