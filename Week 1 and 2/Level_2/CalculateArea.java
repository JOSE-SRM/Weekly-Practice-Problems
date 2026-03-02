import java.util.Scanner;
class CalculateArea{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the Base of the triangle: ");
    double base = input.nextDouble();
    System.out.println("Enter the Height of the triangle: ");
    double height = input.nextDouble();
    
    double areaInCM = 0.5 * base * height;
    double areaInIN = areaInCM * 2.54;

    System.out.println("Area of the Triangle in cm is " + areaInCM + " and in Inch is " + areaInIN);

  }
}
