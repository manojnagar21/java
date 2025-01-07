import java.util.*;

public class Pyramid {
    /**
     * Prints a pyramid pattern using recursion.
     * @param num the number of rows in the pyramid
     * @param chara the character to use for the pyramid
     */
    public static void print(int num, char chara) {
        if(num == 0) {
            return;
        }
        printRows(1, num, chara);
    }

    /**
     * Recursively prints rows of the pyramid.
     * @param start the current row number
     * @param num the total number of rows
     * @param chara the character to use for the pyramid
     */
    public static void printRows(int start, int num, char chara) {
        if(start > num) {
            return;
        }
        printCharacters(start, chara);
        System.out.println();
        printRows(start + 1, num, chara);
    }

    /**
     * Recursively prints characters for a given row.
     * @param start the number of characters to print
     * @param chara the character to print
     */
    public static void printCharacters(int start, char chara) {
        if(start == 0) {
            return;
        }
        System.out.print(chara);
        printCharacters(start - 1, chara);
    }

    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = myObj.nextInt();
            System.out.print("Enter character: ");
            char chara = myObj.next().charAt(0);
            System.out.printf("Number: %d%nCharacter: %s", num, chara);
            System.out.println();
            print(num, chara);
            myObj.close();
        } catch(Exception e) {
            System.out.print("Cancelled");
        }
    }
}