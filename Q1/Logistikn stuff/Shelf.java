/**
 * @author @PatreonOfficial
 * @version v2
 * changelog:
 * v2:
 * - can now be used in the exact same way like a stack,
 * with the exeption of the "getWeight" method, wich has a pretty descriptive name.
 */
public class Shelf{
    private Stack <Crate> crates = new Stack();
    private int myWeight;
    private int maxWeight;
    
    public Shelf(int pMaxWeight){
        maxWeight = pMaxWeight;
    }
    public void push(Crate pCrate){
        //Simply adds an Crate to the Shelf
        if(maxWeight >= getWeight() + pCrate.getWeight()){
            crates.push(pCrate);
        }
    }
    public void pop(){
        //Removes the last added Crate from the Shelf
        crates.pop();
    }
    public boolean isEmpty(){
        //returns true if shelf is empty
        return crates.isEmpty();
    }
    public Crate top(){
        //returns the last added Crate
        return crates.top();
    }
    public int getWeight(){
        //adds the weight of all Crates in the Shelf, for later usage 
        myWeight=0;
        Stack <Crate> tmp = new Stack();
        while(!crates.isEmpty()){
            myWeight += crates.top().getWeight();
            tmp.push(crates.top());
            crates.pop();
        }
        while(!tmp.isEmpty()){
            crates.push(tmp.top());
            tmp.pop();
        }
        return myWeight;
    }
    public int getMaxWeight(){return maxWeight;} //... Just returns the maxWeight... honestly, why do I write these?
}
