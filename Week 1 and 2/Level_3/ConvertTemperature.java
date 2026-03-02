import java.util.Scanner;

class ConvertTemperature {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the Temperature in Celsius: ");
    double temperatureInCelsius = input.nextDouble();

    double temperatureInFahrenheit = (temperatureInCelsius * (9.0 / 5.0)) + 32;

    System.out.println("The " + temperatureInCelsius + " celsius and " + temperatureInFahrenheit + " fahrenheit.");

  }
}
