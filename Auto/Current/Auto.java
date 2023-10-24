//v.0.1
/**
*- max geld
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
    
    public Auto(float iGasUsage, float iTankVol, float iGasPrize){
        km = 0;
        GasLeft = 0;
        TankVol = iTankVol;
        GasUsage = iGasUsage/100;
        Damage = false;
        GasPrize = iGasPrize;
    }
    
    //Method for Driving
    public void Drive(float driveKm){
        if(GasLeft - GasUsage*driveKm > 0 && Damage == false){
           GasLeft = GasLeft - GasUsage*driveKm;
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
        GasLeft += RefillAmount;
        if(GasLeft > TankVol){
            Damage = true;
            System.out.println("Du hast zu voll getankt, dein Tank ist jetzt kaputt");
        }
        
        GasBill = GasPrize * RefillAmount;
        System.out.println("Du hast " + GasBill + "€ bezahlt.");
        
    }
    
    //get all values
    public void GetMeters(){
        km = km;
        GasLeft = GasLeft;
        GasUsage = GasUsage;
        TankVol = TankVol;
        
        GasPrize = GasPrize;
        GasBill = GasBill;
        Damage = Damage;
    }
    
    //repair
    public void repair(){
        GasLeft = TankVol;
        Damage = false; 
    }
}