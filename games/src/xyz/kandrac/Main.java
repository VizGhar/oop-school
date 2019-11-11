package xyz.kandrac;

import xyz.kandrac.engine.Screen;
import xyz.kandrac.game.Arkanoid;

public class Main {

    public static void main(String[] args) {
        new Screen.Builder()
                .setScreenWidth(600)
                .setScreenHeight(600)
                .setGameLoop(new Arkanoid())
                .setTitle("Space Invaders")
                .build()
                .start();
    }

}
