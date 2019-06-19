/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.game.rainbow.tetris;

import com.the_nights.rainbow_engine.core.Engine;
import com.the_nights.rainbow_engine.core.Game;
import com.the_nights.rainbow_engine.core.graphics.Screenbuffer;
import dk.game.rainbow.tetris.blocks.*;

/**
 *
 * @author Stephanie
 */
public class TetrisGame extends Game {

    Block currentBlock = new Square();

    private void play() throws InterruptedException {
        while (true) {
            renderScreen();
            if (!collision()) {
                currentBlock.moveDown();
            } else {
                for (Location l : currentBlock.getShape()) {
                    GameData.map[l.x][l.y] = true;
                }
                currentBlock = new Square();
            }
            Thread.sleep(400);
        }
    }

    private void renderScreen() {
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int y = 0; y < GameData.heigth; y++) {
            System.out.print("|");
            for (int x = 0; x < GameData.width; x++) {
                if (GameData.map[x][y]) {
                    System.out.print("+");
                } else {
                    boolean b = false;
                    boolean c = false;
                    // Checks if block is at spot
                    for (Location l : currentBlock.getShape()) {
                        if (l.x == x && l.y == y) {
                            b = true;
                        }
                        if (currentBlock.center.x == x && currentBlock.center.y == y) {
                            c = true;
                        }
                    }
                    if (c) {
                        System.out.print("c");
                    } else if (b) {
                        System.out.print("b");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("|");
        }
    }

    private boolean collision() {
        if (currentBlock.center.y == GameData.heigth - 1) {
            return true;
        }

        for (Location l : currentBlock.getShape()) {
            if (GameData.map[l.x][l.y + 1]) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void update(Engine engine) {
    }

    @Override
    public void render(Screenbuffer screenbuffer) {

    }

    @Override
    public void loadAssets() {

    }

    @Override
    public void startGame(Engine engine) {

    }

    @Override
    public void resetGame(Engine engine) {

    }

    @Override
    public void pauseGame(Engine engine) {

    }

    @Override
    public void esc(Engine engine) {

    }

    @Override
    public int countGameObjects() {
        return 0;
    }
}
