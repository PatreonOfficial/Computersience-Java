/**
 * @author @PatreonOfficial
 * @version alpa1
 */
public class Warehouse
{
    private int maxWeight;
    private Shelf r0, r1, r2, r3, temp;
    public Warehouse(){
        //Aranges all the Shelfes acording to the assignment
        temp = new Shelf(587498635);
        r0 = new Shelf(587498635); //This is basicly infinity
        r1 = new Shelf(100);
        r2 = new Shelf(100);
        r3 = new Shelf(100);
    }
    public void basicSetup(){
        //Just a quick way to test if this thing works, purly optional and can be replaced with maual labor.
        r0.push(new Crate(50,99));
        r0.push(new Crate(51,27));
        r0.push(new Crate(52,30));
        r0.push(new Crate(53,92));
        r0.push(new Crate(55,444));
        r0.push(new Crate(100,78));
        r0.push(new Crate(69,1));
    }
    public void push(Crate pCrate){
        //.. just adds a Crate to the 0th Shelf, what did you thought?
        r0.push(pCrate);
    }
    public void printAllWeights(){
        //Mainly used for debugging, was pretty helpfull for that
        System.out.println("\nShelf 0 weighs " + r0.getWeight() + " Kg");
        System.out.println("Shelf 1 weighs " + r1.getWeight() + " Kg");
        System.out.println("Shelf 2 weighs " + r2.getWeight() + " Kg");
        System.out.println("Shelf 3 weighs " + r3.getWeight() + " Kg\n");
    }
    public void sort(){
        //Tries to arrange all Crates from r0 to the other Shelfs, leaves the rest Crates "Untouched"
        printAllWeights();
        while(!r0.isEmpty()){
            if(r0.top().getWeight() + r1.getWeight() <= r1.getMaxWeight()){
                r1.push(r0.top());
                r0.pop();
            }
            else if(r0.top().getWeight() + r2.getWeight() <= r2.getMaxWeight()){
                r2.push(r0.top());
                r0.pop();
            }
            else if(r0.top().getWeight() + r3.getWeight() <= r3.getMaxWeight()){
                r3.push(r0.top());
                r0.pop();
                }
            else{
                System.out.println("Can not sort Crate, too heavy for any shelf");
                System.out.println("R0 Top Crate: " + r0.top().getWeight() + " Kg");
                System.out.println("Skiping Crate with ID " + r0.top().getID() + "\n");
                temp.push(r0.top());
                r0.pop();
            }
        }
        while(!temp.isEmpty()){r0.push(temp.top());temp.pop();} //Returns Crates freom Temp back to r0
        printAllWeights();
    }
}
