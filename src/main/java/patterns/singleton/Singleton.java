package patterns.singleton;

public class Singleton {
  private static Singleton uniqueSingleton;
  String name;

  private Singleton() {
    name = "I am single, random val " + Math.random();
  }

  public static synchronized Singleton getInstance() {
    if (uniqueSingleton == null) {
      uniqueSingleton = new Singleton();
    }
    return uniqueSingleton;
  }

  public String toString() {
    return name;
  }
}
