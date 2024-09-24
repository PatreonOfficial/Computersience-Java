/**
 * @author PatreonOfficial
 * @version UrMom
 */
public class array
{
    int[][] test = {{1,2,3},{5,9,7},{587,364,258}};
    public array(){
    }
    public void print(){
        for(int i=0;i<test.length;i++){
            for(int j=0;j<test[i].length;j++){
                System.out.print(" " + test[i][j]);
            }
            System.out.println("\n");
        }
    }
}
