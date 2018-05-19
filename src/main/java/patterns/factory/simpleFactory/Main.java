package patterns.factory.simpleFactory;

import patterns.factory.simpleFactory.pizza.Pizza;

public class Main {
  public static void main(String args[]) {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore pizzaStore = new PizzaStore(factory);

    Pizza pizza = pizzaStore.orderPizza("cheese");
    System.out.println("Got pizza: " + pizza.getName());
  }
}
