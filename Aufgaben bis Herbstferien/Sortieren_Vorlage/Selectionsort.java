
/**
 * @author 
 * @version 
 */
public class Selectionsort
{
    public int[] selectionsort(int[] sortieren) {
        int sortet[] = new int[sortieren.length]; //Create an array thats gona be sorted in the end
        
        for(int i=0; i < sortieren.length; i++){
            int temp = sortieren[0];
            int carry = 0;
            for(int n=0; n < sortieren.length; n++){
                if(sortieren[n]<temp){
                    temp = sortieren[n];
                    carry=n; //Used for eliminating this result
                }
            }
            sortieren[carry]=2147483647;//32 bit int limit because I dont want to use another array
            sortet[i] = temp;
        }
     
        return sortet;
    }
    
    
     public void main() {
        //Erstellung eines unsortierten Arrays
        int[] unsortiert = { 4, 1, 8, -3, 5, 7 };
        
        // Ausgabe des unsrotierten Arrays
        for (int i = 0; i < unsortiert.length; i++) {
            System.out.print(unsortiert[i] + ", ");
        }
        System.out.println();
        
        // Unsortiertes Array wird in einem neuen Array sortiert.
        int[] sortiert = selectionsort(unsortiert);
        
        // Neues, sortiertes Array wird ausgegeben.
        for (int i = 0; i < sortiert.length; i++) {
            System.out.print(sortiert[i] + ", ");
        }

    }
}
