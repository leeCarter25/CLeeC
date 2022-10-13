package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static Input input = new Input();

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student tyrone = new Student("Tyrone M");
        tyrone.addGrade(90);
        System.out.println(tyrone.getGradeAverage());
        System.out.println(tyrone.getGradeAverage() == 90);
        tyrone.addGrade(70);
        System.out.println(tyrone.getGradeAverage() == 80);

        Student aaron = new Student("Aaron R");
        aaron.addGrade(100);
        aaron.addGrade(50);

        Student kevin = new Student("Kevin S");
        kevin.addGrade(87);
        kevin.addGrade(99);

        students.put("tyronem", tyrone);
        students.putIfAbsent("aaronr", aaron);
        students.putIfAbsent("kevins", kevin);

        cli(students);

    }

    public static void cli(HashMap<String, Student> students){
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");
        do{

            for (String key : students.keySet()) {
                System.out.println(key + " ");
            }

            System.out.println("What student would you like to see more information on?\n");
            String typedKey = input.getString();
            if(students.containsKey(typedKey)){

                Student currentStudent = students.get(typedKey);

                System.out.println(String.format("Name: %s - GitHub Username: %s\n"
                                + "Current Average: %.2f",
                        currentStudent.getName(),
                        typedKey,
                        currentStudent.getGradeAverage()
                ));
            }else{
                System.out.println("Sorry, no student found with the GitHub username of "+ typedKey);
            }
            System.out.println("Would you like to see another student?");
        }while(input.yesNo());

        System.out.println("Goodbye, and have a wonderful day!");

    }

}
