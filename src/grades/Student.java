package grades;

import java.util.ArrayList;


public class Student {
    private String Name;
    private ArrayList<Integer> grade = new ArrayList<Integer>();


    public void setName(String Name) {
        this.Name = Name;
    }

    public void setGrade(ArrayList grade) {
        this.grade = grade;
    }

    public String getName() {
        return this.Name;
    }
    public ArrayList<Integer> getGrade(int grade) {
        return this.grade;

//        public double getGradeAverage() {
//
//        };



    }






}


