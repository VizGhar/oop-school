package xyz.kandrac.engine;

import java.awt.*;

/**
 * Dummy game loop with all abstract methods implemented.
 * It will display nothing and will refresh screen every 15ms
 * which is about 66fps.
 */
public class DummyGameLoop extends GameLoop {

    public DummyGameLoop() {
        super(15);
    }

    @Override
    protected void doDrawing(Graphics2D g) {

    }
}
