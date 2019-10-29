public class Pen {
    private int width;
    private Ink ink;

    public Pen(int width, Ink ink) {
        this.width = width;
        this.ink = ink;
        ink.getColor();
    }

    public void draw("kreslim " + + " s atramentom farby " + getColor() + " hrubky " + width);
}
