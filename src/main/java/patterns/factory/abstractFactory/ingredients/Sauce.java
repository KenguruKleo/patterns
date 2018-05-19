package patterns.factory.abstractFactory.ingredients;

public abstract class Sauce {
  String name = "Unknown sauce";

  @Override
  public String toString() {
    return name;
  }
}
