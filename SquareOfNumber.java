import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its square: ");
        int number = scanner.nextInt();

        int square = number * number;

        System.out.println("Square of " + number + " is: " + square);

        scanner.close();
    }
}