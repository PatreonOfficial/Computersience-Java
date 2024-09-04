public class Main {
    int array[] = {0,15,64,94,812,6540,654,3,59,20};
    int temp = 0;
    int summ = 0;
    public void main() {
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public void max() {
        for(int i = 0; i < array.length; i++){
            if(array[i]>temp){
                temp = array[i];
            }
        }
        temp = 0;
    }
    public void min() {
        for(int i = 0; i < array.length; i++){
            if(array[i]>temp){
                temp = array[i];
            }
        }
        temp = 0;
    }
    public void summe() {
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}