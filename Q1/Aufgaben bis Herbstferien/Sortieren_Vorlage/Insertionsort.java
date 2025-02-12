/**
 * @author 
 * @version 
 */
public class Insertionsort
{
    public int[] insertionsort(int[] sortieren) {
        int n = sortieren.length;
	for (int i = 0; i < n - 1; i++) {
		int lower = i;
		for (int j = i + 1; j < n; j++) {
			if (sortieren[j] < sortieren[lower]) {
				lower = j;
			}
		}
		int temp = sortieren[lower];
        	sortieren[lower] = sortieren[i];
		sortieren[i] = temp;
		}
        return sortieren;
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
        int[] sortiert = insertionsort(unsortiert);
        
        // Neues, sortiertes Array wird ausgegeben.
        for (int i = 0; i < sortiert.length; i++) {
            System.out.print(sortiert[i] + ", ");
        }

    }

}
