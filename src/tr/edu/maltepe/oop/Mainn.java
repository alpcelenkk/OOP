package tr.edu.maltepe.oop;

public class Mainn {
    public static void main(String[] args) {

     Student std = new Student();
     Professor prf = new Professor();

     System.out.println("Student name: "+std.getName()+"\n"+"Student ID: "+std.GetID());
     std.learns();
     System.out.println("Professor name: "+prf.GetName()+"\n"+"Professor Age: "+prf.GetAge()+"\n"+"Class name: "+prf.GetClassName());
     prf.teaches();


    }
}
