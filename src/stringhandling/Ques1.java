package stringhandling;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrayInputString = input.nextLine().split("");
        System.out.print("index:\t");
        for (int i = 0; i < arrayInputString.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.print("chars:\t");
        for (int i = 0; i < arrayInputString.length; i++) {
            System.out.print(arrayInputString[i] + "\t");
        }
    }
}
