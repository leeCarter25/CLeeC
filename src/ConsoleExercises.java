import java.util.Scanner;


public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f %n", pi);



        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a Number");
        int userNum = scan.nextInt();
        System.out.println(userNum);


        System.out.println("Enter Three Words");
        String userInput = scan.next();
        String userInput2 = scan.next();
        String userInput3 = scan.next();
        System.out.printf("%s %s %s.%n", userInput, userInput2, userInput3);

        System.out.println("Enter a Sentence");
        String favSentence = scan.nextLine();
        System.out.println(favSentence);

        System.out.println("Enter Width");
        String widthVal = scan.nextLine();
        System.out.println(widthVal);

        System.out.println("Enter Length");
        String lengthVal = scan.nextLine();
        System.out.println(lengthVal);

        int width = 7;
        int height = 10;
        int area = width * height;
        System.out.println("Area of rectangle=" + area);

        System.out.println("Enter Width");
        String widthPer = scan.nextLine();
        System.out.println(widthPer);

        System.out.println("Enter Length");
        String lengthPer = scan.nextLine();
        System.out.println(lengthPer);


        {
            float a, b, c, d, perimeter;
            a = c = 10;
            b = d = 10;
            perimeter = 2 * (a + b);
            System.out.println("Perimeter of Rectangle is: " + perimeter);
        }
    }
}
