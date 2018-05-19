package patterns.factory.abstractFactory.ingredients;

public abstract class Dough {
  String name = "Unknown dough";

  @Override
  public String toString() {
    return name;
  }
}
