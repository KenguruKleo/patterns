package patterns.factory.abstractFactory.ingredients;

public interface PizzaIngredientsFactory {
  public Dough createDough();
  public Sauce createSauce();
  public Cheese createCheese();
  public Clam createClam();
}
