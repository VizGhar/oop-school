package xyz.kandrac;

public class Pen {

    private int width;
    private Ink ink;

    public Pen(int width, Ink ink) {
        this.width = width;
        this.ink = ink;
    }

    public void draw(String shape) {
        System.out.println("drawing " + shape + " with ink of color "
                + ink.getColor() + " and width of " + width);
    }
}
