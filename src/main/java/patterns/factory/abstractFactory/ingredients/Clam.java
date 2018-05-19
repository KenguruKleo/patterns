package patterns.factory.abstractFactory.ingredients;

public abstract class Clam {
  String name = "Unknown clam";

  @Override
  public String toString() {
    return name;
  }
}
