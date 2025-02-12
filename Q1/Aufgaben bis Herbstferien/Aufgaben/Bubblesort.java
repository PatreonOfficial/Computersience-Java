/**
 * Insertionsort for Mathias Zeiger
 *
 * @author Justus Osthoff (@PatreonOfficial)
 * @version alpha
 */
public class Bubblesort
{
    private int[] array = {8,7,6,2,1,9};
    public Bubblesort()
    {
        int n = 0;
        int temp;
        boolean sorted = false;
        int fail = 0;
        while(sorted==false && fail < 90000){
            for(int i=0;array.length>i;i++){
                sorted = true;
                if(array[n]>array[n+1]){
                    temp = array[n];
                    array[n] = array[n+1];
                    array[n+1] = temp;
                    sorted = false;
                }
            }
            fail+=1;
        }
        for(int i=0;array.length>i;i++){
            System.out.println(array[i]);
        }
    }
}
