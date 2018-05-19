package patterns.observer;

public class mainObserver {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    ConditionalDisplay conditionalDisplay = new ConditionalDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    weatherData.setMeasurements(80, 66, 30.4f);
    weatherData.setMeasurements(65, 60, 37.0f);
    weatherData.setMeasurements(77, 55, 50.9f);
  }
}
