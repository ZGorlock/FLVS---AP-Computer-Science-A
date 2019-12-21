import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
    private int steps;
    private int move;
    private int[] dance;
    private int sideLength;

    /**
     * Constructs a dancing bug that traces a dance of a given array of side length
     * @param length the side length
     * @param turns the array of turns for the dance
     */
    public DancingBug(int length, int[] turns)
    {
        move = 0;
        steps = 0;
        sideLength = length;
        dance = turns;
    }

    /**
     * Moves to the next location of the dance.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            for (int x = 0; x < dance[move]; x++)
                turn();
            steps = 0;
            if (move == (dance.length - 1))
                move = -1;
            move++;
        }
    }
}
