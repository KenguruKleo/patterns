package patterns.observer;

import org.jetbrains.annotations.*;

public class ForecastDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private float pressure;
  private Subject weatherData;

  public ForecastDisplay(@NotNull Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void display() {
    System.out.println("Forecast conditions: " + pressure + " pressure, humidity: " + humidity);
  }

  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }
}
