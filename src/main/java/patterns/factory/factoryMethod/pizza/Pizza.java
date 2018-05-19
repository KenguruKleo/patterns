package patterns.factory.factoryMethod.pizza;

import java.util.ArrayList;

public abstract class Pizza {
  String name = "Unknown Pizza";
  String dough = "Unknown Dough";
  String sauce = "Unknown Sauce";
  ArrayList<String> toppings = new ArrayList<>();

  public String getName() {
    return name;
  }

  public String getSauce() {
    return sauce;
  }

  public String getDough() {
    return dough;
  }

  public void prepare() {
    System.out.println("Prepare pizza: " + getName());
    System.out.println("Tossing dough: " + getDough());
    System.out.println("Adding sauce: " + getSauce());
    System.out.println("Adding toppings...");
    toppings.forEach((item) -> System.out.println("    " + item));
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
