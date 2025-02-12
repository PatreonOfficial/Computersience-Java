/**
 * First Assignment.
 *
 * @author PatreonOfficial
 * @version Omega
 */
public class first
{
    private Stack<Integer> myfirst;
    private int counter;
    public first()
    {
        myfirst = new Stack<Integer>();
        myfirst.push(0);
        myfirst.push(1);
        myfirst.push(2);
        myfirst.push(3);
        myfirst.push(4);
        myfirst.push(5);
        myfirst.push(6);
        myfirst.push(7);
        myfirst.push(8);
        myfirst.push(9);
    }
    
    public void output(){
        Stack<Integer> temp;
        temp = new Stack<>();
        counter = 0;
        while(!myfirst.isEmpty()){
            temp.push(myfirst.top());
            System.out.println(myfirst.top());
            myfirst.pop();
            counter ++;
        }
        while(!temp.isEmpty()){
            myfirst.push(temp.top());
            temp.pop();
        }
    }
    public int counter(){
        output();
        System.out.println("\nWe have "+counter+" Elements");
        return counter;
    }
    public int search(int test){
        Stack<Integer> temp;
        temp = new Stack<>();
        boolean exists = false;
        while(!myfirst.isEmpty()){
            temp.push(myfirst.top());
            System.out.println(myfirst.top());
            if(myfirst.top() == test){exists = true;}
            myfirst.pop();
        }
        while(!temp.isEmpty()){
            myfirst.push(temp.top());
            temp.pop();
        }
        if(exists){System.out.println("\nSucces, "+test+" exists!");return test;}
        else{System.out.println("\nFaliure, "+test+" does not exist!");return -69;}
    }
}
