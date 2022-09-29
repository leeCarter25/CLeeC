import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        boolean converation = false;
        do {
            System.out.println("Say something to bob:");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.endsWith("?")) {
                System.out.println("Sure");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }

            System.out.println("Would you like to keep talking with bob?[y/n]");
            String userInput = scanner.nextLine();
            if(userInput.equalsIgnoreCase("y")){
                converation = true;
            }else if(userInput.equalsIgnoreCase("n")){
                converation = false;
            }

        }while(converation == true);
    }

}

