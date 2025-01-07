import java.util.*;

public class Pattern {
    /**
     * Prints a pyramid pattern using iteration.
     * @param num the number of rows in the pyramid
     * @param chara the character to use for the pyramid
     */
    public static void print1(Integer num, char chara) {
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(chara);
            }
            System.out.println();
        }
    }

    /**
     * Prints a pyramid pattern using recursion.
     * @param num the number of rows in the pyramid
     * @param chara the character to use for the pyramid
     */
    public static void print2(Integer num, char chara) {
        // base case
        if (num == 0) {
            return;
        }
        printRows(1, num, chara);
        System.out.println();
    }

    /**
     * Recursively prints rows of the pyramid.
     * @param currentRow the current row number
     * @param totalRows the total number of rows
     * @param chara the character to use for the pyramid
     */
    private static void printRows(int currentRow, int totalRows, char chara) {
        // Base case: stop when currentRow exceeds totalRows
        if (currentRow > totalRows) {
            return;
        }
        // Print current row's characters
        printChars(currentRow, chara);
        if(currentRow != totalRows) {
            System.out.println(); // Move to the next line
        }
        // Recursive call for the next row
        printRows(currentRow + 1, totalRows, chara);
    }

    /**
     * Recursively prints characters for a given row.
     * @param count the number of characters to print
     * @param chara the character to print
     */
    private static void printChars(int count, char chara) {
        // Base case: stop when no more characters to print
        if (count == 0) {
            return;
        }
        System.out.print(chara);
        // Recursive call to print the next character
        printChars(count - 1, chara);
    }

    public static void main(String[] args) {
        try {
            System.out.println("aaa");
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter a pattern number");
            // Enter pattern number
            System.out.println("Enter a pattern number to print from the list");
            System.out.println(
                """
                1. Print pyramid using iteration
                2. Print pyramid using recursion
                """
            );
            Integer patternNum = myObj.nextInt();
            System.out.println("Enter a number");
            Integer num = myObj.nextInt();
            if(num == 0) {
                myObj.close();
                return;
            }
            System.out.println("Enter a character");
            char chara = myObj.next().charAt(0);
            switch(patternNum){
                case 1:
                    System.out.println("Print pyramid using iteration");
                    print1(num, chara);
                    break;
                case 2:
                    System.out.println("Print pyramid using recursion");
                    print2(num, chara);
                    break;
                default:
                    System.out.println("No valid input");
            }
            myObj.close();
        } catch(Exception e) {
            System.out.print("Cancelled");
        }
    }   
}