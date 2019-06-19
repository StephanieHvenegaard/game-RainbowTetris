/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.game.rainbow.tetris;

import com.the_nights.rainbow_engine.core.Engine;

/**
 *
 * @author Stephanie
 */
public class Starter {

    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setGame(new TetrisGame());
        engine.startEngine();
    }
}
