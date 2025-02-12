

public class Patient
{
    private String name;
    private int Status;
    
    
    public Patient(String pName, int pStatus)
    {
        name=pName;
        Status=pStatus;
    }
    
    public String getName(){
        return name;
    }
    
    public int getStatus(){
        return Status;
    }

    
}
