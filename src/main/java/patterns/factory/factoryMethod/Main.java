package patterns.factory.factoryMethod;

import patterns.factory.factoryMethod.pizza.*;

public class Main {
  public static void main(String args[]) {
    PizzaStore pizzaStoreChicago = new PizzaStoreChicago();
    Pizza pizza = pizzaStoreChicago.orderPizza("cheese");
    System.out.println("Got pizza: " + pizza.getName());

    PizzaStore pizzaStoreNY = new PizzaStoreNY();
    Pizza pizza1 = pizzaStoreNY.orderPizza("clam");
    System.out.println("Got pizza: " + pizza1.getName());
  }
}
