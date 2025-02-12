
/**
 * @author PatreonOfficial
 * @version 
 */
public class Bubblesort
{
    public int [] bubblesort (int [] sortieren){
        int temp;
        boolean sorted = false;
        while(!sorted){
            for(int i=0;sortieren.length-1>i;i++){
                sorted = true;
                if(sortieren[i]>sortieren[i+1]){
                    temp = sortieren[i];
                    sortieren[i] = sortieren[i+1];
                    sortieren[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return sortieren;
    }
      
    public void main (){
      //Erstellung eines unsortierten Arrays
      int [] unsortiert = {5,1,8,2,7,4};
      
      // Ausgabe des unsrotierten Arrays
      for (int i=0;i<unsortiert.length;i++){
            System.out.print (unsortiert[i]+", ");
        }
        System.out.println ();
        
        // Unsortiertes Array wird in einem neuen Array sortiert.
        int [] sortiert = bubblesort(unsortiert);
        
        // Neues, sortiertes Array wird ausgegeben.
        for (int i=0;i<sortiert.length;i++){
            System.out.print (sortiert[i]+", ");
        }
    }

}
