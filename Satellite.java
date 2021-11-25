import java.util.ArrayList;
class Satellite{
    int id;
    static ArrayList<LEOSatellite>LEOarr=new ArrayList<LEOSatellite>();
    static ArrayList<GroundStation>GSarr=new ArrayList<GroundStation>();
    public void initialize(){
        for(int i=0;i<10;i++){
            if(i<5){
                Satellite.LEOarr.add(new LEOSatellite(i));}
                Satellite.GSarr.add(new GroundStation(i));
            }
        }
}
