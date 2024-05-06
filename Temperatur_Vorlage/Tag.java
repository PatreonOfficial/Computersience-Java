
public class Tag
{
    private int temperatureMin;
    private int temperatureMax;
    private int RiskOfRaining;
    private int SunHours;
    private boolean icyRoads;
   
    public Tag(int tMin, int tMax, int rw, int sst)
    {
        temperatureMin=tMin;
        temperatureMax=tMax;
        RiskOfRaining=rw;
        SunHours=sst;
        if(tMin<=3 || tMax<=3){
            icyRoads=true;
        }else{
            icyRoads=false;
        }
    }
    
    public int getTempMin(){
        return temperatureMin;
    }
    
    public int getTempMax(){
        return temperatureMax;
    }
    
    public int getRiskRain(){
        return RiskOfRaining;
    }
    
    public int getSunHours(){
        return SunHours;
    }
    
    public boolean getIcyRoads(){
        return icyRoads;
    }
}