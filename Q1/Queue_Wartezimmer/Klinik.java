/*
 * Made by you's truely: PatreonOfficial
 * As asignment in fking school
 * 
 */
public class Klinik
{
    private Queue<Patient> line;
    private int numb; //Number of Patients
    
    public Klinik()
    {
        line=new Queue<Patient>();
    }
    
    //public void signup(String pName, String pInsurance){
    //    line.enqueue(new Patient(pName, pInsurance));
    //}
    public void signup2(String pName, int pStatus){
        Patient p = new Patient(pName, pStatus);
        Queue<Patient> h;
        h = new Queue<Patient>();
        if(line.isEmpty()){line.enqueue(new Patient(pName, pStatus));}
        else{
            while(pStatus >= line.front().getStatus()){
                h.enqueue(line.front());
                line.dequeue();
            }
            while(!line.isEmpty()){
                h.enqueue(line.front());
                line.dequeue();
            }
            line=h;
        }
    }
    public void call(){
        if(!line.isEmpty()){
            System.out.print(line.front().getName());
            System.out.println(", please go to room 5");
            line.dequeue();
        }
        else{System.out.println("There is no one in the Waitingsnake!");}
    }
    
    public void listAll(){
        Queue<Patient> q2 = new Queue<Patient>();
        if(!line.isEmpty()){
        while(!line.isEmpty()){
            System.out.println(line.front().getName());
            q2.enqueue(line.front());
            line.dequeue();
        }
        while(!q2.isEmpty()){
            line.enqueue(q2.front());
            q2.dequeue();
        }
        }else{
            System.out.println("Waitingsnake is empty!");
        }
    }

    
    public int count(){
        numb = 0;
         Queue<Patient> q2 = new Queue<Patient>();
        if(!line.isEmpty()){
            while(!line.isEmpty()){
                numb ++;
                q2.enqueue(line.front());
                line.dequeue();
            }
            while(!q2.isEmpty()){
                line.enqueue(q2.front());
                q2.dequeue();
            }
        }else{
            System.out.println("Waitingsnake is empty!");
        }
        return numb;
    }
    public boolean search(String pName){
        Queue<Patient> q2 = new Queue<Patient>();
        boolean isIn=false;
        if(!line.isEmpty()){
            while(!line.isEmpty()){
                q2.enqueue(line.front());
                if(line.front().getName()==pName){
                    isIn = true;
                }
                line.dequeue();
            }
            while(!q2.isEmpty()){
                line.enqueue(q2.front());
                q2.dequeue();
            }
        }else{
            System.out.println("Waitingsnake is empty!");
        }
        return isIn;
    }
}
