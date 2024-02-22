package Oops;

class Pen {
    String color;
    int tip;

    void Setcolor(String newcolor) {
        color = newcolor;

    }

    void SetTip(int newtip) {
        tip = newtip;
    }
}

public class Basic {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.Setcolor("Red");
        System.out.println(p1.color);
        p1.SetTip(10);
        System.out.println(p1.tip);

    }
}