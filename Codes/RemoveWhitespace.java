//Write a program to remove all whitespaces from the String.

import java.util.Scanner;

public class RemoveWhitespace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.replaceAll("\\s", "");

        System.out.println("String after removing whitespaces: " + result);

        sc.close();
    }
}