// Write a program to convert double to float.
import java.util.Scanner;

public class DoubleToFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        float f = (float) d;

        System.out.println("Float value: " + f);

        sc.close();
    }
}
