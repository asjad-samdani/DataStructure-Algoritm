package Oops;

public class Inheritance {
    public static void main(String[] args) {
        Bird b= new Bird();
        b.breath();
        b.type2();

    }
}

class Animal {
    void eat(){
        System.out.println("Eating");
    }
    void breath(){
        System.out.println("breathing");
    }
}
class Fish extends Animal{
    void type(){
        System.out.println("Tuna");
    }
}
class Bird extends Animal{
    void type2(){
        System.out.println("Decock");
    }
}

