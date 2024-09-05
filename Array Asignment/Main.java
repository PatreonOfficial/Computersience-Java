public class Main {
    int array[] = {0,15,64,94,812,6540,654,3,59,20};
    int temp = 0;
    int temp2 =0;
    int summ = 0;
    public void main() {
        
    }
    public void print(){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public void max() {
        temp = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i]>temp){
                temp = array[i];
            }
        }
        System.out.println(temp);
        temp = 0;
    }
    public void min() {
        temp = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i]<temp){
                temp = array[i];
            }
        }
        System.out.println(temp);
        temp = 0;
    }
    public void summe() {
        for(int i = 0; i < array.length; i++){
            temp += array[i];
        }
        System.out.println(temp);
        temp = 0;
    }
    public void mid() {
        for(int i = 0; i < array.length; i++){
            temp += array[i];
        }
        System.out.println(temp/array.length);
        temp = 0;
    }
    public void replace(int index1, int index2){
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        System.out.println("Replaced!");
        temp = 0;
    }
    public void count(int search){
        for(int i = 0; i < array.length; i++){
            if(array[i]==search){
                temp ++;
            }
        }
        System.out.println(search +" kommt "+ temp + " mal vor.");
        temp = 0;
    }
    public void twice(int search){
        boolean bool = false;
        for(int i = 0; i < array.length; i++){
            if(array[i]==search){
                temp ++;
            }
        }
        if(temp == 2){
            bool = true;
        }
        System.out.println(bool);
        temp = 0;
    }
    public void minTwo(){
        temp = array[0];
        int index = 0;
        temp2 = 2147483647;
        for(int i = 0; i < array.length; i++){
            if(array[i]<temp){
                temp = array[i];
                index = i;
            }
        }
        for(int i = 0; i<array.length;i++) {
            if(index != i && array[i]<temp2){
                temp2 = array[i];
            }
        }
        System.out.println(temp +" & "+ temp2);
        temp = 0;
        temp2 = 0;
    }
}