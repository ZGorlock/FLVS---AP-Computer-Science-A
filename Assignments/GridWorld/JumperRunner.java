/*
 *Jumper Bug Runner
 *
 *@author
 *@version
 */

import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import java.awt.Color;

public class JumperRunner
{
    public static void main( String args[] )
    {
        ActorWorld world = new ActorWorld( );
        Jumper jumpBug1 = new Jumper( );
        jumpBug1.setColor(Color.CYAN);
        world.add ( new Location(7, 8), jumpBug1 );

        world.add( new Location(4, 8), new Rock( ) );
        world.add( new Location(3, 5), new Rock( ) );
        world.add( new Location(4, 4), new Rock( ) );

//		world.add( new Bug( ) );
//		world.add( new Rock( ) );

        world.show( );
    }
}