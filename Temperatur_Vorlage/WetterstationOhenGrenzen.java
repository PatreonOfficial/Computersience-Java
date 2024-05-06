/**
 * Write a description of class WetterstationOhenGrenzen here.
 *
 * @author PatreonOfficial
 * @version alpha (02.05.2024)
 */
public class WetterstationOhenGrenzen
{
    Tag [] january;

    public WetterstationOhenGrenzen()
    {
        january = new Tag[31];
    }

    public void addTemp(Tag t)
    {
        for(int i = 0; i < january.length; i++){
            if(january[i]==null){
                january[i] = t;
            }
        }
    }
    public void ausgeben(){
        for(int i = 0; i < january.length; i++){
            if(january[i]!=null){
                System.out.println("Temp max on day "+i+" "+ january[i].getTempMax());
                System.out.println("Temp min on day "+i+" "+ january[i].getTempMin());
            }
        }
    }
     public void average(){
        int biene = 0;
        int real_length = 0;
        for(int i = 0; i < january.length; i++){
            if(january[i]!=null){
                biene += january[i].getTempMax();
                real_length ++;
            }
        }
        System.out.println("The max temp average ist "+biene/real_length);
    }
}
