package xyz.kandrac.engine;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public abstract class MouseGameLoop extends GameLoop implements MouseMotionListener, MouseListener {

    private int lastKnownMouseX = 0;
    private int lastKnownMouseY = 0;
    private boolean mousePressed = false;

    public MouseGameLoop() {
        super(10);
        addMouseMotionListener(this);
        addMouseListener(this);
    }

    public abstract void draw(Graphics2D g);

    public int getLastKnownMouseX() {
        return lastKnownMouseX;
    }

    public int getLastKnownMouseY() {
        return lastKnownMouseY;
    }

    public boolean isMousePressed() {
        return mousePressed;
    }

    @Override
    protected void doDrawing(Graphics2D g) {
        draw(g);
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        lastKnownMouseX = mouseEvent.getX();
        lastKnownMouseY = mouseEvent.getY();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == MouseEvent.BUTTON1) {
            mousePressed = true;
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == MouseEvent.BUTTON1) {
            mousePressed = false;
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
