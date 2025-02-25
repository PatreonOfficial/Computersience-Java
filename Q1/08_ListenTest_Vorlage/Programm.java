public class Programm
{
    private List<Integer> list;
    
    public Programm()
    {
        list=new List<Integer>();
        
        list.append(500);
        list.append(300);
        list.append(150);
        
        print();
        System.out.println(count());
        System.out.println(min());
        System.out.println(max());
        System.out.println(exists(0));
        System.out.println(exists(300));
    }
    
    public void print()
    {
        /*Die bestehende list soll vollständig in der
        Konsole ausgegeben werden.*/
        list.toFirst();
        while(list.hasAccess()){
            System.out.println(list.getContent());
            list.next();
        }
    }
    
    public int count(){
        int count = 0;
        list.toFirst();
        while(list.hasAccess()){
            count ++;
            list.next();
        }
        return count;
    }
    
    public int max(){
        list.toFirst();
        int max = list.getContent();
        list.next();
        while(list.hasAccess()){
            if(list.getContent() > max){max = list.getContent();}
            list.next();
        }
        return max;
    }
    
    public int min(){
        list.toFirst();
        int min = list.getContent();
        list.next();
        while(list.hasAccess()){
            if(list.getContent() < min){min = list.getContent();}
            list.next();
        }
        return min;
    }
    
    public boolean exists (int x){
        boolean exists = false;
        list.toFirst();
        while(list.hasAccess()){
            if(list.getContent() == x){exists = true;}
            list.next();
        }
        return exists;
    }
    
    public void to(int x){
        list.toFirst();
        while(list.getContent() != x){
            list.next();
        }
    }
    //From min to Max
    //Use temp list
    public void sort(){
        List<Integer> temp;
        temp=new List<Integer>();
        list.toFirst();
        while(list.hasAccess()){
            temp.append(min());
            to(min());
            list.remove();
            list.toFirst();
        }
        list.concat(temp);
    }
    
    public void insertSorted(int x){
        sort();
        list.toFirst();
        boolean inserted = false;
        while(list.hasAccess()){
            if(list.getContent() >= x){
                list.insert(x);
                inserted = true;
                break;
            }
            list.next();
        }
        if(!inserted){
            list.append(x);
        }
        print();
    }
}
