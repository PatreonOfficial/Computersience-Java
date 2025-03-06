

public class Wettkampfergebnis
{
    private List<Wettkampfkarte> alleWettkaempfe;
    private int anzahlWettkampfkarten;
    
    public Wettkampfergebnis(){
        alleWettkaempfe = new List<Wettkampfkarte>();
        anzahlWettkampfkarten = 0;
    }
    
    public void ergaenzeKarte(Wettkampfkarte pW){
        //Wettkampfkarte(String pName,String pVorname, String pKlasse)
        new Wettkampfkarte(pW.getName(), pW.getVorname(), pW.getKlasse());
    }
    
    public Wettkampfkarte besteKarte(int pDisziplin){
        auswahlSort(pDisziplin);
        alleWettkaempfe.toFirst();
        return alleWettkaempfe.getContent();
        
    }
    
    //UNVERÄNDERT LASSEN
    public void ausgabe(){
        alleWettkaempfe.toFirst();
        while(alleWettkaempfe.hasAccess()){
            System.out.println(alleWettkaempfe.getContent().toString());
            alleWettkaempfe.next();
        }
    }
    
    public void auswahlSort(int pDisziplin) {
        List<Wettkampfkarte> temp = new List<>();
        alleWettkaempfe.toFirst();
        while(alleWettkaempfe.hasAccess()){
            temp.append(max());
            to(max());
            alleWettkaempfe.remove();
            alleWettkaempfe.toFirst();
        }
        alleWettkaempfe.concat(temp);
    }
    public int max(int pDisziplin){
        alleWettkaempfe.toFirst();
        int max = alleWettkaempfe.getContent().getPunkte(pDisziplin);
        alleWettkaempfe.next();
        while(alleWettkaempfe.hasAccess()){
            if(alleWettkaempfe.getContent().getPunkte(pDisziplin) > max){
                max = alleWettkaempfe.getContent().getPunkte(pDisziplin);
            }
            alleWettkaempfe.next();
        }
        return max;
    }
    //UNVERÄNDERT LASSEN
    public List<Wettkampfkarte> getWettkampfkarten(){
        return alleWettkaempfe;
    }
    
    

    
}
