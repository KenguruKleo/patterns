package patterns.factory.abstractFactory.ingredients;

public class PizzaIngredientFactoryNY implements PizzaIngredientsFactory {
  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public Clam createClam() {
    return new FreshClam();
  }
}
