import info.gridworld.actor.Bug;

public class zBug extends Bug
{
    private boolean setDir;
    private int sides;
    private int steps;
    private int sideLength;

    /**
     * Constructs a z bug that traces a z of a given side length
     * @param length the side length
     */
    public zBug(int length)
    {
        setDir = true;
        sides = 0;
        steps = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the z.
     */
    public void act()
    {
        if (sides < 3 && canMove())
        {
            if (setDir)
            {
                setDirection(90);
                setDir = false;
            }
            if (steps < sideLength)
            {
                move();
                steps++;
            }
            else
            {
                if (sides == 0)
                    setDirection(225);
                else
                    if (sides == 1)
                        setDirection(90);
                steps = 0;
                sides++;
            }
        }
    }
}
