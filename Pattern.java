import java.util.*;
public class Pattern {
    public static void print1(Integer num, char chara) {
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(chara);
            }
            System.out.println();
        }
    }
    public static void print2(Integer num, char chara) {
        // base case
        if (num == 0) {
            return;
        }
        printRows(1, num, chara);
        System.out.println();
    }
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
        try{
            System.out.println("aaa");
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter a pattern number");
            // Enter pattern number
            System.out.println("Enter a pattern number to print from the list");
            System.out.println(
                "1. Print pyramid using iteration\n" +
                "2. Print pyramid using recursion\n"
            );
            Integer patternNum = myObj.nextInt();
            System.out.println("Enter a number");
            Integer num = myObj.nextInt();
            if(num == 0) {
                myObj.close();
                return;
            }
            System.out.println("Enter a charatcer");
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