/**
 * @author = PatreonOfficial
 * @version = v1
 */
public class Mensch
{
    /**
     * hight  in cm
     * age in years
     * dof in yyyyMMdd
     * mass in Kg
     * gender in m/w/d
     * name ........
     */
    int hight;
    int age;
    int dof;
    int mass;
    char gender;
    String name;
    String eye_color;
    
    double bmi;
    
    public Mensch(int ihight, int iage, int idof, int imass, char igender, String iname, String ieye_color)//construktor
    {
        hight = ihight;
        age = iage;
        dof = idof;
        mass = imass;
        gender = igender;
        name = iname;
        eye_color = ieye_color;
    }
    
    //Methods
    public void changeMensch(int ihight, int iage, int idof, int imass, char igender, String iname, String ieye_color)
    {
        hight = ihight;
        age = iage;
        dof = idof;
        mass = imass;
        gender = igender;
        name = iname;
        eye_color = ieye_color;
    }
    
    public void bmi()
    {
        float fmass = mass;
        float fhight = hight;
        bmi = fmass/((fhight/100)*(fhight/100));
    }
}