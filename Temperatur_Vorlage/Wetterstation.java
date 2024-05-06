
/**
 * @author: PatreonOfficial
 * @version 
 */
public class Wetterstation
{
    int temp[] = {3,4,1,0,10,12,4,5,8,2,1,3}; //Aufg. a
   
    public Wetterstation()
    {
        

    }
    
    public void ausgeben(){ //Aufg. b
        for(int i = 0; i < temp.length; i++){
            System.out.println(temp[i]);    
        }  
    }
    
    public void average(){ //Aufg. c
        int avg = 0;
        for(int i = 0; i < temp.length; i++){
            avg += i;    
        }
        System.out.println(avg/temp.length);
    }
    
    public void min(){ //Aufg. e
        int min = temp[0];
        for(int i = 0; i < temp.length; i++){
            if(min < temp[i]){
                min = i;
            }
        }
        System.out.println(temp[min] +" Grad an Tag " + min);
    }
    
    public void min2(){
        int min = temp[0];
        int min2 = temp[0];
        for(int i = 0; i < temp.length; i++){
            if(temp[min] < temp[i]){
                min2 = min;
                min = i;
            }
        }
        System.out.println(temp[min] +" Grad an Tag " + min + ". Die 2. kleiste Temperatur ist an  Tag "+ min2 +" Mit "+temp[min2]+" grad");
    }
   
    public void max(){ //Aufg. d
      int max = temp[0];
        for(int i = 0; i < temp.length; i++){
            if(temp[max] > temp[i]){
                max = i;
            }
        }
        System.out.println(temp[max] +" Grad an Tag " + max);
    }
    
    public boolean suche (int x){ //Aufg. f
        for(int i = 0; i < temp.length; i++){
            if(x == temp[i]){
                return true;
            }
        }
        return false;
    }
    
    public void warnung(){ //Aufg. g
        for(int i = 0; i < temp.length; i++){
            if(3 >= temp[i]){
               System.out.println(i);
            }
        }
    }

}
//by Justus ; PatreonOfficial