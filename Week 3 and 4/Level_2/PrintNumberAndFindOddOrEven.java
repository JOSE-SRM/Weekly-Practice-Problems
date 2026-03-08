import java.util.Scanner;

class PrintNumberAndFindOddOrEven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = input.nextInt();

    if(number <= 0 ){ System.out.println(" Invalid Number. Enter a Natural Number.");}

    for (int num = 1; num <= number; num++) {
      System.out.print("Is the number " + num + ", odd or even?  ");
      if (num % 2 == 0) {
        System.out.println("Even");
      } else {
        System.out.println("Odd");
      }
    }
    input.close();
  }
}


