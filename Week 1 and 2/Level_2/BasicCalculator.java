import java.util.Scanner;
public class BasicCalculator{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the First Number: ");
    double number1 = input.nextDouble();
    System.out.println("Enter the Second Number: ");
    double number2 = input.nextDouble();

    double sum = number1 + number2;
    double difference = number1 - number2;
    double multiplicant = number1 * number2;
    double quotient = number1 / number2;

    System.out.println(number1 + "+" + number2 + "=" + sum + "\n" + number1 + "-" + number2 + "=" + difference + "\n" + number1 + "*" + number2 + "=" + multiplicant + "\n" + number1 + "/" + number2 + "=" + quotient);

  }
}
