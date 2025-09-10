import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the color of the traffic signal (Red, Yellow, Green): ");
        String color = scanner.nextLine().trim().toLowerCase();

        switch (color) {
            case "red":
                System.out.println("STOP! Wait for the signal to turn green.");
                break;
            case "yellow":
                System.out.println("READY! Be prepared to stop or go.");
                break;
            case "green":
                System.out.println("GO! You can proceed.");
                break;
            default:
                System.out.println("Invalid color! Please enter Red, Yellow, or Green.");
        }

        scanner.close();
    }
}