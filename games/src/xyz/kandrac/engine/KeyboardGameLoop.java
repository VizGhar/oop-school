package xyz.kandrac.engine;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;

public abstract class KeyboardGameLoop extends GameLoop implements KeyListener {

    private Set<Integer> pressedKeys = new HashSet<>();

    public KeyboardGameLoop(int gameLoopTime) {
        super(gameLoopTime);
        setFocusable(true);
        addKeyListener(this);
    }

    public abstract void resolveKey(int keyCode);
    public abstract void draw(Graphics2D g);

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        pressedKeys.add(keyEvent.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        pressedKeys.remove(keyEvent.getKeyCode());
    }

    @Override
    protected void doDrawing(Graphics2D g) {
        for (int key : pressedKeys) {
            resolveKey(key);
        }
        draw(g);
    }
}
