package xyz.kandrac.game;

import xyz.kandrac.engine.KeyboardGameLoop;

import java.awt.*;
import java.awt.event.KeyEvent;

public final class Arkanoid extends KeyboardGameLoop {

    private static int STEP = 5;
    private static int PLATFORM_WIDTH = 40;
    private static int PLATFORM_HEIGHT = 10;

    private int platformPosition = 0;

    public Arkanoid() {
        super(5);
    }

    @Override
    public void resolveKey(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_LEFT: platformPosition--; break;
            case KeyEvent.VK_RIGHT: platformPosition++; break;
        }
    }

    @Override
    public void draw(Graphics2D g) {
        platformPosition = Math.max(0, platformPosition);
        platformPosition = Math.min(platformPosition, (getWidth() - PLATFORM_WIDTH)/ STEP);
        g.fillRect(platformPosition * STEP, getHeight() - PLATFORM_HEIGHT, PLATFORM_WIDTH, PLATFORM_HEIGHT);
    }
}
