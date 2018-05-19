package patterns.factory.abstractFactory.ingredients;

public abstract class Cheese {
  String name = "Unknown cheese";

  @Override
  public String toString() {
    return name;
  }
}
