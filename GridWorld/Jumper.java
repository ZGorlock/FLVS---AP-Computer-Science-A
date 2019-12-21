/**
 * Creates a Jumper object.
 * 
 * @author Zachary Gill
 * @version 04-03-2013
 */

import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;

public class Jumper extends Bug
{
    private Color jumperColor;
    
    /**
     * Constructs a red jumper.
     */
    public Jumper()
    {
        setColor(Color.RED);
    }

    /**
     * Constructs a jumper of a given color.
     * @param jumperColor the color for this jumper
     */
    public Jumper(Color jumperColor)
    {
        super(jumperColor);
    }

    /**
     * Moves the jumper forward
     */
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
    }

    /**
     * Tests whether this juymper can move forward into a location that is empty
     * @return true if this jumper can move
     */
    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null);
    }
}