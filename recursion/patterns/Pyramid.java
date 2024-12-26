import java.util.*;
public class Pyramid {
    public static void print(int num, char chara) {
        if(num == 0) {
            return;
        }
        int start = 1;
        printRows(start, num, chara);
        System.out.println();
    }
    public static void printRows(int start, int num, char chara) {
        if(start > num) {
            return;
        }
        printCharacters(start, chara);
        if(start != num) {
            System.out.println();
        }
        printRows(start + 1, num, chara);
    }
    public static void printCharacters(int start, char chara) {
        if(start == 0) {
            return;
        }
        System.out.print(chara);
        printCharacters(start - 1, chara);
    }
    public static void main(String[] args) {
        try{
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter number");
            int num = myObj.nextInt();
            System.out.print("Enter character");
            char chara = myObj.next().charAt(0);
            System.out.printf("Number: %d%nCharacter: %s",num, chara);
            System.out.println();
            print(num, chara);
            myObj.close();
        } catch(Exception e) {
            System.out.print("Cancelled");
        }
    }
}