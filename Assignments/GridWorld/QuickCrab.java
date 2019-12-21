import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import java.awt.Color;

public class QuickCrab extends CrabCritter
{
  public ArrayList<Location> getMoveLocations()
  {
    ArrayList<Location> locs = new ArrayList<Location>();
    int[] dirs = {Location.LEFT, Location.RIGHT};
    for (int dir : dirs)
    {
        dir = dir + getDirection();
        Location loc = getLocation().getAdjacentLocation(dir);
        if(getGrid().isValid(loc) && getGrid().get(loc) == null)
        {
            Location loc2 = loc.getAdjacentLocation(dir);
            if(getGrid().isValid(loc2) && getGrid().get(loc2) == null)
                locs.add(loc2);
        }
    }    
    if(locs.size() > 0)
      return locs;
    return super.getMoveLocations();
  }
}