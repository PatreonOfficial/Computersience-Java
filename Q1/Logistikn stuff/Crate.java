/**
 * @author @PatreonOfficial
 * @version v1
 */
public class Crate{
    private int ID; //Currently not used for anything exept one print statement
    private int Weight;
    public Crate(int pID, int pWeight){
        ID = pID;
        Weight = pWeight;
    }
    public int getID(){
        return ID;
    }
    public int getWeight(){
        return Weight;
    }
}
