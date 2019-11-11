package xyz.kandrac.engine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Game loop base.
 */
public abstract class GameLoop extends JPanel implements ActionListener {

    private Timer timer;
    private Toolkit toolkit;

    /**
     * Called during {@link #paintComponent(Graphics)} call.
     * All UI synchronization processes are properly handled,
     * so you just need to call draw operations here.
     *
     * Refresh rate can be currently set only by using
     * constructor
     *
     * @param g
     */
    protected abstract void doDrawing(Graphics2D g);

    public GameLoop(int gameLoopTime) {
        initTimer(gameLoopTime);
        toolkit = Toolkit.getDefaultToolkit();
    }

    public void destroy() {
        timer.stop();
    }

    private void initTimer(int gameLoopTime) {
        timer = new Timer(gameLoopTime, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing((Graphics2D) g);
        toolkit.sync();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}