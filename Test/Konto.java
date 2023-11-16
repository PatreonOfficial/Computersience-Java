/**
 * This Class currently has no purpose.
 *
 * @author PatreonOfficial
 * @version v0.1
 */
public class Konto
{
    // instance variables - replace the example below with your own
    private int accID;
    private float accVal;
    private String accOwner;
    
    public Konto(int iaccID, String iaccOwner)
    {
        // initialise instance variables
        accID = iaccID;
        accOwner = iaccOwner;
        accVal = 0f;
        System.out.println("New acc created for "+accOwner+ " with id "+ accID);
    }
    public void deposit(int iVal) //Einzahlen
    {
        accVal += iVal;
        System.out.println("Deposited "+ iVal+ " to acc with ID " +accID);
        System.out.println("    --> New acc Val: " +accVal+"€");
        if(iVal >= 10000){
            System.out.println("    -->We will report your Earnigs to the Police since you deposited above 10k!");
        }
    }
    public void withdraw(int iVal) // Auszahlen
    {
        if(iVal > accVal && iVal < 0){
            System.out.println("We are Sorry, but you dont have enough money ;(");
        }
        else{
            accVal -= iVal;
            System.out.println("Withdrew "+ iVal+ " from acc with ID " +accID);
            System.out.println("    --> New acc Val: " +accVal+"€");
        }
    }
    public void transaction(String reciver, int reciverID, float transactionVal){
        //build a Transaction method
    }
}
