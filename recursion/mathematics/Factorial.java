package recursion.mathematics;
import java.util.*;

public class Factorial {
    /**
     * Calculates the factorial of a number using iteration.
     * @param num the number to calculate the factorial of
     * @return the factorial of the number
     */
    private static int factorialUsingIteration(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    /**
     * Calculates the factorial of a number using recursion.
     * @param num the number to calculate the factorial of
     * @return the factorial of the number
     */
    private static int factorialUsingRecursion(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        return factorialUsingRecursion(num) * factorialUsingRecursion(num - 1);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();
        System.out.println("Enter a Choice");
        System.out.println(
            "1. Factorial using iteration\n" +
            "2. Factorial using recursion"
        );
        int choice = myObj.nextInt();
        int answer = 0;
        switch (choice) {
            case 1:
                System.out.println("Factorial using iteration of "+num+" is: ");
                answer = factorialUsingIteration(num);
                System.out.println(answer);
                break;
            case 2:
                System.out.println("Factorial using recursion of "+num+" is: ");
                answer = factorialUsingRecursion(num);
                System.out.println(answer);
                break;
            default:
                break;
        }
        myObj.close();
    }
}
