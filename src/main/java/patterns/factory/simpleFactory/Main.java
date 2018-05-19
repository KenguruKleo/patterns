package patterns.factory.simpleFactory;

import patterns.factory.simpleFactory.pizza.Pizza;

public class Main {
  public static void main(String args[]) {
    PizzaStore pizzaStoreChicago = new PizzaStore(new SimplePizzaFactoryChicago());
    Pizza pizza = pizzaStoreChicago.orderPizza("cheese");
    System.out.println("Got pizza: " + pizza.getName());

    PizzaStore pizzaStoreNY = new PizzaStore(new SimplePizzaFactoryNY());
    Pizza pizza1 = pizzaStoreNY.orderPizza("clam");
    System.out.println("Got pizza: " + pizza1.getName());
  }
}
