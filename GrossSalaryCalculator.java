  import java.util.Scanner;

    public class GrossSalaryCalculator {

        // Method to calculate the gross salary
        public static double calculateGrossSalary(double basicSalary) {
            double HRA, DA;

            if (basicSalary > 15000) {
                HRA = basicSalary * 0.2;
                DA = basicSalary * 0.6;
            } else {
                HRA = 3000;
                DA = basicSalary * 0.7;
            }

            return basicSalary + HRA + DA;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                // Taking input from the user for basic salary
                System.out.print("Enter the basic salary of the employee: ");
                double basicSalary = scanner.nextDouble();

                // Calculating the gross salary
                double grossSalary = calculateGrossSalary(basicSalary);

                // Displaying the gross salary
                System.out.println("The gross salary of the employee is: " + grossSalary);

                // Asking the user if they want to continue or exit
                System.out.print("Enter -1 to calculate for another employee or any other number to exit: ");
                choice = scanner.nextInt();

            } while (choice == -1);

            scanner.close();
            System.out.println("Program ended.");
        }
    }

