
public class Lotto
{
    // instance variables - replace the example below with your own
    private boolean [] drawn;
    private int CurNum;
    public Lotto()
    {
        drawn = new boolean[49];
        for(int i = 0;i<drawn.length ;i++){
            drawn[i] = false;
        }
    }
    
    public void Draw(){
        for(int b=0; b<6; b++){
            CurNum = (int)(Math.random() * 48 + 1);
            
            if(drawn[CurNum]==false){
                drawn[CurNum] = true;
            }
            else{b-=1;}
        }
        System.out.println("\nThose numbers where drawn:");
         for(int i = 0;i<drawn.length ;i++){
            if(drawn[i]){
                System.out.print(i + ", ");
            }
        }
        for(int i = 0;i<drawn.length ;i++){
            drawn[i] = false;
        }
    }
}
