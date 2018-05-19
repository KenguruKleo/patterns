package patterns.factory.abstractFactory.pizza;

import patterns.factory.abstractFactory.ingredients.*;

public abstract class Pizza {
  String name = "Unknown Pizza";
  Dough dough;
  Sauce sauce;
  Cheese cheese;
  Clam clam;

  public String getName() {
    return name;
  }

  public Dough getDough() {
    return dough;
  }

  public Sauce getSauce() {
    return sauce;
  }

  public Cheese getCheese() { return cheese; }

  public Clam getClam() { return clam; }

  abstract public void prepare();

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
