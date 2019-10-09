package xyz.kandrac;

public class Main {

    public static void main(String[] args) {
        Ink ink = new Ink("yellow");
        Pen pen = new Pen(12, ink);
        pen.draw("circle");
    }
}
