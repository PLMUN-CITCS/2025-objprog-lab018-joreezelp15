import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        int number = getIntegerInput();
        String result = checkEvenOrOdd(number);
        System.out.println(result);
    }

    public static int getIntegerInput() {
        Scanner input = new Scanner(System.in);
        int number;
        
        while (true) {
            System.out.print("Enter an integer: ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.next();
            }
        }
        
        input.close();
        return number;
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}