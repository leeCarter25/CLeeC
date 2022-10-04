import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        multiply(5, 10);
        division(33, 3);
        addition(10, 10);
        subtraction(20, 8);
        modulus(13, 6);
        getInteger(1, 10);

    }
    public static void multiply(int a, int b) {
        System.out.println(a * b);

    }

    public static void division(int x, int y) {
        System.out.println(x / y);
    }
    public static void addition(int c, int d) {
        System.out.println(c + d);
    }

    public static void subtraction(int y, int z) {
        System.out.println(y - z);
    }
    public static void modulus(int e, int f) {
        System.out.println(e % f);
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10:");
        int userInput = scanner.nextInt();
        if(userInput < 1 || userInput > 10) {
            System.out.println("Invalid Number please enter a number in a range.");
            userInput = getInteger(1, 10);
        }
        return userInput;
    };


}
