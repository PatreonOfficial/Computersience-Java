public class Wettkampfkarte
{
    private String name;
    private String vorname;
    private String klasse;
    private int punkteLauf;   // 1
    private int punkteSprung; // 2
    private int punkteWurf;   // 3
                              // 4 = Gesamtwert
                          
    
    public Wettkampfkarte(String pName,String pVorname, String pKlasse)
    {
        name = pName;
        vorname = pVorname;
        klasse = pKlasse;
        punkteLauf = punkteSprung = punkteWurf = 0;
    }
    
    
    //UNVERÄNDERT LASSEN
    public Wettkampfkarte(String zeile) {
        String[] teile = zeile.split(",");
        name = teile[0];
        vorname = teile[1];
        klasse = teile[2];
        punkteLauf = Integer.valueOf(teile[3]);
        punkteSprung = Integer.valueOf(teile[4]);
        punkteWurf = Integer.valueOf(teile[5]);
    }
    
    public String getName(){
       return name;
    }
    
    public String getVorname(){
        return vorname;
    }
    
    public String getKlasse(){
        return klasse;
    }
    
    public int getPunkte(int pDisziplin){
        if(pDisziplin == 1){return punkteLauf;}
        else if(pDisziplin == 2){return punkteSprung;}
        else if(pDisziplin == 3){return punkteWurf;}
        else if(pDisziplin == 4){return (punkteLauf + punkteSprung + punkteWurf);}
        else{return 69;}
    }
    
    public void setzePunkte(int pDisziplin, int pPunkte){
        if(pDisziplin == 1){punkteLauf = pPunkte;}
        else if(pDisziplin == 2){punkteSprung = pPunkte;}
        else if(pDisziplin == 3){punkteWurf = pPunkte;}
        else{System.out.println("Falsche Disziplin!");}
    }
    
    //UNVERÄNDERT LASSEN
    public String toString() {
        return name + "," + klasse + "," + +punkteLauf + ","
                + punkteSprung + "," + punkteWurf;
    }
}
