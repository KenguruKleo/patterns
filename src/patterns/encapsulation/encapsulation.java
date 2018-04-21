package patterns.encapsulation;

import patterns.encapsulation.duck.Duck;
import patterns.encapsulation.duck.MallardDuck;

public class encapsulation {
  public static void main(String[] args){
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
  }
}
