package tr.edu.maltepe.oop;

public class Student {

    private int student_ID = 180704018;
    private String name_s = "Alp";

    public int GetID() {
        return student_ID;
    }
    public String getName() {
        return name_s;
    }
    public void SetID(int newValue) {
        student_ID = newValue;
    }
    public void setName(String newString) {
        name_s = newString;
    }

    public void learns(){
        System.out.println("He learns.");
    }
}
