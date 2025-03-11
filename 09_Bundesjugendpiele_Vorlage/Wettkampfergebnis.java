import java.util.Random;

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
        Wettkampfkarte WK = new Wettkampfkarte(pW.getName(), pW.getVorname(), pW.getKlasse());
        WK.setzePunkte(1,pW.getPunkte(1));
        WK.setzePunkte(2,pW.getPunkte(2));
        WK.setzePunkte(3,pW.getPunkte(3));
        anzahlWettkampfkarten ++;
        alleWettkaempfe.append(WK);
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
    public List<Wettkampfkarte> getWettkampfkarten(){
        return alleWettkaempfe;
    }
    
    public void auswahlSort(int pDisziplin) {
        List<Wettkampfkarte> temp = new List<>();
        alleWettkaempfe.toFirst();
        while(alleWettkaempfe.hasAccess()){
            temp.append(max(pDisziplin));
        }
        alleWettkaempfe.concat(temp);
    }
    public Wettkampfkarte max(int pDisziplin){
        alleWettkaempfe.toFirst();
        int max = alleWettkaempfe.getContent().getPunkte(pDisziplin);
        Wettkampfkarte bW = new Wettkampfkarte("0,0,0,0,0,0");
        bW = alleWettkaempfe.getContent(); 
        alleWettkaempfe.next();
        while(alleWettkaempfe.hasAccess()){
            if(alleWettkaempfe.getContent().getPunkte(pDisziplin) < max){
                max = alleWettkaempfe.getContent().getPunkte(pDisziplin);
                bW = alleWettkaempfe.getContent();
            }
            alleWettkaempfe.next();
        }
        alleWettkaempfe.toFirst();
        while(alleWettkaempfe.getContent().getPunkte(pDisziplin) != bW.getPunkte(pDisziplin)){
            alleWettkaempfe.next();
        }
        System.out.println(max);
        alleWettkaempfe.remove();
        return bW;
    }
    
    public void erzeugeBeispiele() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            String n = "Name" + i;
            String v = "Vorname" + i;
            String k = "Klasse_7";
            int ps = r.nextInt(100);
            int pl = r.nextInt(100);
            int pw = r.nextInt(100);
            Wettkampfkarte wk = new Wettkampfkarte(n, v, k);
            wk.setzePunkte(2, ps);
            wk.setzePunkte(1, pl);
            wk.setzePunkte(3, pw);
            ergaenzeKarte(wk);
        }
    }

    
}
