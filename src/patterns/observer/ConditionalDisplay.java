package patterns.observer;

public class ConditionalDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private float pressure;
  private Subject weatherData;

  public ConditionalDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature + " temperature, humidity: " + humidity);
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }
}
