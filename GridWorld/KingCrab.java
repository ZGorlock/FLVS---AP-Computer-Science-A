import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class KingCrab extends CrabCritter
{
    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            int antidir = a.getLocation().getDirectionToward(getLocation()) + Location.HALF_CIRCLE;
            Location loc = a.getLocation().getAdjacentLocation(antidir);
            if (getGrid().isValid(loc) && getGrid().get(loc) == null)
                a.moveTo(loc);
            else
                a.removeSelfFromGrid();
        }
    }
}