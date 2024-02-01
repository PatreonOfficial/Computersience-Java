
/**
 * main class of project
 *
 * @author PatreonOfficial
 * @version alpha
 */
public class main
{
    // instance variables - replace the example below with your own
    private int pin;
    private int number;
    private boolean isOn;
    private boolean isLocked;

    public main(int inumber){
        pin=0000;
        number=inumber;
        isOn=true;
        isLocked=false;
    }
    public void turnOn(){
        if(isOn == false){
            isOn=true;
            System.out.println("Your phone is now on, please unlock it");
        }
        else{System.out.println("Phone is already on...");}
    }
    public void turnOff(){
        if(isOn){
            isOn=false;
            isLocked=true;
            System.out.println("Your phone is now off");
        }
        else{System.out.println("Off... ♥");}
    }
    public void unlock(int iPin){
        if(iPin == pin && isOn){
            isLocked=false;
            System.out.println("Phone unlocked!");
        }
        else if(isOn){System.out.println("error 1: Wrong pin");}
        else{System.out.println("Off... ♥");}
    }
    public void changePin(int iPin, int nPin){
        if(iPin == pin && isOn){
            isLocked=true;
            pin=nPin;
            System.out.println("Pin changed to:" + nPin);
        }
        else if(isOn){System.out.println("error 1: Wrong pin");}
        else{System.out.println("Off... ♥");}
    }
    public void fetchNumber(){
        System.out.println("Your phone number is: " + number);
    }
    
    public void sendMessage(main to, String message){
        to.reciveMessage(number, to, message);
    }
    public void reciveMessage(int cid, main to, String message){
        if(isLocked == false && isOn){
            System.out.println(to +": Message from "+ cid +" recived: "+ message);
        }
    }
}
