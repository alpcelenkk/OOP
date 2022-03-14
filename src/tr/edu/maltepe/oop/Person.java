package tr.edu.maltepe.oop;

public class Person {

    private int age_p = 50;
    private String name_p = "Ensar";

    public int GetAge() {
        return age_p;
    }
    public String GetName() {
        return name_p;
    }
    public void SetAge(int NewValue) {
        age_p = NewValue;
    }
    public void SetName(String NewWord) {
        name_p = NewWord;
    }
}



