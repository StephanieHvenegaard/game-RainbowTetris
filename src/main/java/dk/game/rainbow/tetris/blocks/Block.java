/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.game.rainbow.tetris.blocks;

import dk.game.rainbow.tetris.GameData;
import dk.game.rainbow.tetris.Location;


/**
 *
 * @author Stephanie
 */
public abstract class Block {
    public Location center;
    public abstract Location[] getShape();  

    public void moveLeft() {
        if(center.x>0)
            center.x--;
    }

    public void moveRight() {       
        if(center.x<GameData.width-1)
            center.x++;
    } 

    public void moveDown() {
        if(center.y<GameData.heigth-1)
            center.y++;
    }    
}
