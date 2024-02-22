package Oops;

public class Oopss {
    public static void main(String[] args) {
        Student s1= new Student("Asjad",13);
        System.out.println(s1.name);
        System.out.println(s1.roll);
        
    }
    
    
}
class Student{
    String name;
    int roll;

    Student(String name, int roll){
        this.name=name;
        this.roll=roll;
    }
}
