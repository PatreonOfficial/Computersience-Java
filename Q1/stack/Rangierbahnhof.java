
/**
 * @author 
 * @version 
 */
public class Rangierbahnhof
{
    private Stack<Integer> gleisA, gleisB, gleisC;
    private int counter = 0;
    
    public Rangierbahnhof()
    {
        gleisA = new Stack<Integer>();
        gleisB = new Stack<Integer>();
        gleisC = new Stack<Integer>();
        gleisA.push(16);
        gleisA.push(11);
        gleisA.push(15);
        gleisA.push(14);
        gleisA.push(7);        
    }
    
    
    public void rangieren(){
        while(true){
            gleisC.push(gleisA.top());
            gleisA.pop();
            while(!gleisA.isEmpty()){
                if(gleisA.top() >= gleisC.top()){
                    gleisB.push(gleisA.top());
                    gleisA.pop();
                }
                else if(gleisA.top() <= gleisC.top()){
                    gleisB.push(gleisC.top());
                    gleisC.pop();
                    gleisC.push(gleisA.top());
                    gleisA.pop();
                }
                counter++;
            }
            while(!gleisB.isEmpty()){
                gleisA.push(gleisB.top());
                gleisB.pop();
            }
            if(gleisA.isEmpty()){
                System.out.println("Success!");
                System.out.println("Only "+counter+" loops");
                System.out.println("---------");
                ausgabe();
                break;
            }
        }      
    }
    
   
    public void ausgabe(){
        //Hilfsstack für die Ausgabe        
        Stack<Integer> tmp;
        tmp = new Stack<Integer>();
        
        //Ausgabe von Gleis A
        System.out.println("Gleis A:");
        while (!gleisA.isEmpty())
        {            
            System.out.println(gleisA.top());
            tmp.push(gleisA.top());
            gleisA.pop();
        }
        while (!tmp.isEmpty())
        {
            gleisA.push(tmp.top());
            tmp.pop();
        }
        System.out.println("---------");
        
        //Ausgabe von Gleis B
        System.out.println("Gleis B:");
        while (!gleisB.isEmpty())
        {            
            System.out.println(gleisB.top());
            tmp.push(gleisB.top());
            gleisB.pop();
        }
        while (!tmp.isEmpty())
        {
            gleisB.push(tmp.top());
            tmp.pop();
        }
        System.out.println("---------");
        
        //Ausgabe von Gleis C
        System.out.println("Gleis C:");
        while (!gleisC.isEmpty())
        {            
            System.out.println(gleisC.top());
            tmp.push(gleisC.top());
            gleisC.pop();
        }
        while (!tmp.isEmpty())
        {
            gleisC.push(tmp.top());
            tmp.pop();
        }
        System.out.println("---------");
    }
}
