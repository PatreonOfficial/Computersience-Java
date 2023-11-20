
/**
 * Builds the wanted House useing BetterObjects
 *
 * @author PatreonOfficial (Jörg Justus Osthoff)
 * @version v1
 */
public class HomeBuild
{
    // not needed

    public HomeBuild()
    {
        // not needed
    }

    public void build()
    {
        bSquare base;
        base = new bSquare("brown", 200, 150, 300);
        bSquare window;
        window = new bSquare("yellow", 50, 175, 350);
        
        bTriangle roof;
        roof = new bTriangle("Red", 100, 250, 250, 200);
    }
}