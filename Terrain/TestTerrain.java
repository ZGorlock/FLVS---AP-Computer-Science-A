/**
 * Class that calls Terrain classes to make terrain objects
 * 
 * @author Zachary Gill
 * @version 03-03-2013
 */
public class TestTerrain
{
    /**
     * Main method for TestTerrain class.
     */
    public static void main(String [] args)
    {
        Terrain one = new Terrain(400, 200);
        Forrest two = new Forrest(100, 200, 100);
        Mountain three = new Mountain(300, 400, 25);
        WinterMountain four = new WinterMountain(500, 600, 15, 10.0);
        
        System.out.println(one.terrainSize() + ".");
        System.out.println("Forrest " + two.terrainSize() + " and has " + two.getTree() + " trees.");
        System.out.println("Mountain " + three.terrainSize() + " and has " + three.getMountain() + " mountains.");
        System.out.println("Winter Mountain " + four.terrainSize() + " and has temperature " + four.getTemp() + " and " + four.getMountain() + " mountains.");
    }
}