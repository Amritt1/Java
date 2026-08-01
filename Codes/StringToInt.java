// Write a program to convert String to int. Hint Integer.parseInt()

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number as a string: ");
        String str = sc.nextLine();

        int num = Integer.parseInt(str);

        System.out.println("Converted integer: " + num);

        sc.close();
    }
}