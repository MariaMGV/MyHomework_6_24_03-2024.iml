package methods;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        String pass = "f1rstP@ssword";
        if(PasswordValidation.isValidPassword(pass)){
            System.out.println("Password is valid");
        }
        else
        {
            System.out.println("Password is invalid");
        }
        System.out.println("-------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(PasswordValidation.arePositiveAndEqual(num1, num2, num3)){
            System.out.printf("The three numbers are both positive and equal - %d,%d,%d\n", num1, num2, num3);
        }
        else {
            System.out.printf("The three numbers are not both positive and equal - %d,%d,%d\n", num1, num2, num3);
        }
        System.out.println("-------------------");

        System.out.println("Enter two numbers:");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double average = PasswordValidation.returnAverage(number1, number2);
        System.out.printf("Average is %.2f%n",average);
        System.out.println("Enter one more number:");
        double number3 = scanner.nextDouble();
        double sum = PasswordValidation.returnSum(PasswordValidation.returnAverage(number1,number2),number3);
        System.out.printf("Sum is %.2f%n",sum);

    }
}





