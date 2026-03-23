import java.util.Scanner;

public class PeopleComparator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] Friends = { "Amar", "Akbar", "Anthony" };

    int[] ages = new int[Friends.length];
    double[] heights = new double[Friends.length];

    int tallest = 0, youngest = 1;

    for (int i = 0; i < Friends.length; i++) {
      System.out.println("\nEnter the information of " + Friends[i] + ":");
      System.out.print("\tEnter the age: ");
      int age = input.nextInt();
      System.out.print("\tEnter the height: ");
      double height = input.nextDouble();

      if (age < 0 || height < 0) {
        System.out.println("Invalid input for " + Friends[i] + "! Please re-enter.");
        i--;
      } else {
        ages[i] = age;
        heights[i] = height;
      }
    }

    for (int i = 0; i < Friends.length; i++) {
      if (ages[i] < ages[youngest]) {
        youngest = i;
      }
      if (heights[i] > heights[tallest]) {
        tallest = i;
      }
    }

    System.out.println("\nThe Youngest of the three friends is " + Friends[youngest] + ".");
    System.out.println("The Tallest of the three friends is " + Friends[tallest] + ".");

    input.close();
  }
}
