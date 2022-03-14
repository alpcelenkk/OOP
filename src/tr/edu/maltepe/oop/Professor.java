package tr.edu.maltepe.oop;

public class Professor extends Person{

    private String className = "OOP";

    public String GetClassName(){
        return className;
    }

    public void SetClassName(String NewWord){
        className = NewWord;
    }

    public void teaches(){
        System.out.println("He teaches.");
    }

}
