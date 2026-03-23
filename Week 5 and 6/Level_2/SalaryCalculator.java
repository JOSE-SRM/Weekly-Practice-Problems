import java.util.Scanner;

public class SalaryCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numberOfEmployees = 10;

    double[] oldSalaries = new double[numberOfEmployees];
    double[] yearsOfServices = new double[numberOfEmployees];
    double[] bonuses = new double[numberOfEmployees];
    double[] newSalaries = new double[numberOfEmployees];

    double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;

    System.out.println("Enter details for the " + numberOfEmployees + " employees:");
    for (int i = 0; i < numberOfEmployees; i++) {
      System.out.println("\nEmployee " + (i + 1) + ":");
      System.out.print("\tEnter Salary: ");
      double salary = input.nextDouble();
      System.out.print("\tEnter Years of Service: ");
      double yearsOfService = input.nextDouble();

      if (salary < 0 || yearsOfService < 0) {
        System.out.println("Invalid input for employee " + (i + 1) + "! Please re-enter.");
        i--;
      } else {
        oldSalaries[i] = salary;
        yearsOfServices[i] = yearsOfService;
      }
    }

    for (int i = 0; i < numberOfEmployees; i++) {
      double rate = (yearsOfServices[i] > 5) ? 0.05 : 0.02;

      bonuses[i] = oldSalaries[i] * rate;
      newSalaries[i] = oldSalaries[i] + bonuses[i];

      totalOldSalary += oldSalaries[i];
      totalBonus += bonuses[i];
      totalNewSalary += newSalaries[i];
    }

    System.out.println("\n--- Zara Company Payroll Summary ---");
    System.out.printf("\tTotal Old Salary Payout: %.2f\n", totalOldSalary);
    System.out.printf("\tTotal Bonus Payout     : %.2f\n", totalBonus);
    System.out.printf("\tTotal New Salary Payout: %.2f\n", totalNewSalary);

    input.close();
  }
}
