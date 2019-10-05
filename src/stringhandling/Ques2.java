package stringhandling;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean f = true;
        while (f) {
            try {
                String inputString = input.nextLine().trim();
                int subStringRange = input.nextInt();
                System.out.println(inputString.substring(0, subStringRange));
                f = false;
            } catch (NoSuchElementException e) {
                System.out.println("please enter the valid entry");
            } catch (StringIndexOutOfBoundsException e) {//StringIndexOutOfBoundsException
                System.out.println("enter valid range");
            }
        }


    }
}
