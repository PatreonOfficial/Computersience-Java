//v0.2
/**
*- max geld [y] (Werden durch ints gehandled)
*- fahrbare km (mit jeweiligem verbrauch& tankinhalt) ausgeben
*/
public class Auto{
    private float km;
    private float GasLeft;
    private float GasUsage;
    private float TankVol;
    
    private float GasPrize;
    private float GasBill;
    private boolean Damage;
    
    private float cost;
    private float Money;

    
    public Auto(float iGasUsage, float iTankVol, float iGasPrize){
        km = 0;
        GasLeft = 0;
        TankVol = iTankVol;
        GasUsage = iGasUsage/100;
        Damage = false;
        GasPrize = iGasPrize;
        Money = 10000; //10k from begining
        
    }
    
    //Method for Driving
    public void Drive(float driveKm){
        if(GasLeft - GasUsage*driveKm > 0 && Damage == false){
            GasLeft = GasLeft - GasUsage*driveKm;
            System.out.println("Du hast auf " + driveKm + "km " + GasUsage*driveKm + "L Spritt verbraucht");
            km += driveKm;
        }
        else{
            if(Damage){
                System.out.println("Dein Auto ist kaputt, du kannst nicht fahren");
            }
            else{
                System.out.println("Du kannst nicht so weit fahren, Tank mich, ich habe Durst :)?");
            }
        }
    }

    
    //Method to refill the tank
    public void Refuel(float RefillAmount){
        //GasLeft = GasLeft + RefillAmount;
        cost = GasPrize * RefillAmount;
        if(Money >= cost){
            GasLeft += RefillAmount;
            System.out.println("Du hast " + cost + "€ bezahlt.");
            Money -= cost;
            
            if(GasLeft > TankVol){
                Damage = true;
                System.out.println("Du hast zu voll getankt, dein Tank ist jetzt kaputt");
                Money -= cost;
            }
        }
    }
    
    //repair
    public void repair(){
        cost = 1000;
        if(Money >= cost){ 
            GasLeft = TankVol;
            Damage = false;
            Money -= cost;
            System.out.println("Du hast "+cost+"€ für die Reperatur bezahlt.");
        }
        else{
            System.out.println("Du hast nicht genug Geld, dir Fehlen "+ (Money - cost) +"€");
        }
    }
}