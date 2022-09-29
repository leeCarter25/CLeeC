import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        // Loop Basics a while exercise.

//        int i = 5;
//        while(i <= 15) {
//            System.out.println(i);
//            i++;


//        }

        // Loop Basics b do while exercises.

//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        }
//        while(i <= 100);
//    }

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        }
//        while(i >= -10);
//    }
//        long longnum = 2;
//        do {
//            System.out.println(longnum);
//            longnum *= longnum;
//        } while (longnum < 100000000);

//        for (long i = 2; i < 100000000; i*=i) {
//            System.out.println(i);
//        }

//  Loop Basics c for exercise.

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

        // FizzBuzz Exercise

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i%5 == 0) {
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//
//        }

        //  Display a table of powers exercise.

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Integer");
//        int userInput = sc.nextLine();
//        System.out.println(userInput);


//        String choice = "y";
//
//        while(choice.equalsIgnoreCase("y"))
//        {
//            // get the input from the user
//            System.out.println("Enter an Integer: ");
//            int integerNext = sc.nextInt();
//
//            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
//            System.out.println("======" + "  " + "======" + "  " + "======");
//
//            for(int i = 1; i <= integerNext; i++) {
//                int numberSquared = (int) Math.pow(i, 2);
//                int numberCubed = (int) Math.pow(i, 3);
//
//                String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;
//
//                System.out.println(message);
//                System.out.println();
//            }
//
//                // see if the user wants to continue
//                System.out.print("Continue? (y/n): ");
//                choice = sc.next();
//                System.out.println();
//
//        }

//  Convert given number grades into numbers exercise.

        String choice = "y";

        while(choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.println("Enter a Number: ");
            int integerNext = sc.nextInt();

            if(integerNext >= 88 && integerNext <= 100) {
                System.out.println("You got an A!");
            } else if (integerNext <= 87 && integerNext >= 80) {
                System.out.println("You got a B!");
            } else if (integerNext <=79 && integerNext >= 67) {
                System.out.println("You got a C!");
            } else if (integerNext <= 66 && integerNext >= 60) {
                System.out.println("You got a D!");
            } else {
                System.out.println("You got a F!");
            }


            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();

        }






    }
}




