
/**
 * @author 
 * @version 
 */
public class Test
{
    private Queue<String> q1;
    private Queue<Integer> wbq; //wayBetterQueue
    private Queue<Integer> temp;
    
    //Konstruktor
    public Test()
    {
        q1 = new Queue<String>();
        q1.enqueue("Hallo");
        q1.enqueue("Dein");
        q1.enqueue("Name");
        while(!q1.isEmpty()){
            System.out.println(q1.front());
            q1.dequeue();
        }
        //The queue is emty after this
    }
    
    public void ausgabeOhneVerlust(){
        wbq = new Queue<Integer>();
        temp = new Queue<Integer>();
        wbq.enqueue(6);
        wbq.enqueue(9);
        wbq.enqueue(1337);
        wbq.enqueue(69);
        wbq.enqueue(45);//Hex
        while(!wbq.isEmpty()){
            System.out.println(wbq.front());
            temp.enqueue(wbq.front());
            wbq.dequeue();
        }
        while(!temp.isEmpty()){
            wbq.enqueue(temp.front());
            temp.dequeue();
        }
        System.out.println("Proof:");
        while(!wbq.isEmpty()){
            System.out.println(wbq.front());
            temp.enqueue(wbq.front());
            wbq.dequeue();
        }
    }
}
