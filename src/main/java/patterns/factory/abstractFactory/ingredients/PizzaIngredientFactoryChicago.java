package patterns.factory.abstractFactory.ingredients;

public class PizzaIngredientFactoryChicago implements PizzaIngredientsFactory {
  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public Clam createClam() {
    return new FreshClam();
  }
}
