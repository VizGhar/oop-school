package xyz.kandrac.engine;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Screen extends JFrame {
    private GameLoop gameLoop;

    private Screen() {
    }

    public void start() {
        add(gameLoop);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                gameLoop.destroy();
            }
        });
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static class Builder {

        private int screenWidth = 600;
        private int screenHeight = 600;
        private String title = "";
        private GameLoop gameLoop;

        public Builder setScreenWidth(int screenWidth) {
            this.screenWidth = screenWidth;
            return this;
        }

        public Builder setScreenHeight(int screenHeight) {
            this.screenHeight = screenHeight;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setGameLoop(GameLoop gameLoop) {
            this.gameLoop = gameLoop;
            return this;
        }

        public Screen build() {
            Screen result = new Screen();
            GameLoop game = gameLoop != null ? gameLoop : new DummyGameLoop();
            result.gameLoop = game;
            result.setSize(screenWidth, screenHeight);
            result.setTitle(title);

            return result;
        }
    }
}
