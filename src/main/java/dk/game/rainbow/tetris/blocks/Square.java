/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.game.rainbow.tetris.blocks;

import dk.game.rainbow.tetris.GameData;
import dk.game.rainbow.tetris.Location;
import java.util.Random;

/**
 *
 * @author Stephanie
 */
public class Square extends Block{



    public Square() {
        Random r = new Random();
        int x = r.nextInt(GameData.width);
        center = new Location(x,0);
    }
    
    
    
    @Override
    public Location[] getShape() {
        return new Location[]{ 
            new  Location(center.x-1,center.y-1), new Location(center.x,center.y-1),
            new  Location(center.x-1,center.y), new Location(center.x,center.y)        
                             };
    }

    
}
