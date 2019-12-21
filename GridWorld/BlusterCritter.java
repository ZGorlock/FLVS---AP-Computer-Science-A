import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import java.awt.Color;

public class BlusterCritter extends Critter
{
    private static final double DARKENING_FACTOR = 0.05;
    private int courage;

    public BlusterCritter(int c)
    {
        courage = c;
    }

    public ArrayList<Actor> getActors()
    {
        ArrayList<Actor> actors = new ArrayList<Actor>();
        Location loc1 = getLocation();
        for (int row = loc1.getRow() - 2; row <= loc1.getRow() + 2; row++)
        {
            for (int col = loc1.getCol() - 2; col <= loc1.getCol() + 2; col++)
            {
                Location loc2 = new Location(row, col);
                if (getGrid().isValid(loc2) && loc2 != getLocation())
                {
                    Actor a = getGrid().get(loc2);
                    if (a != null && a instanceof Critter)
                    actors.add(a);
                }
            }
        }
        return actors;
    }

    public void processActors(ArrayList<Actor> actors)
    {
        Color c = getColor();
        if (actors.size() >= courage)            
        {
            int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
            int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
            int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));
            setColor(new Color(red, green, blue));
        }
        else
        {
            int red = (int) (c.getRed() * (1 + DARKENING_FACTOR));
            int green = (int) (c.getGreen() * (1 + DARKENING_FACTOR));
            int blue = (int) (c.getBlue() * (1 + DARKENING_FACTOR));
            setColor(new Color(red, green, blue));
        }
    }
}