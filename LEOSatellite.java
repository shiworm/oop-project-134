
class LEOSatellite extends Constellation implements Runnable {
    int id;
    boolean sentMsgtoGso;
    LEOSatellite(int id){
        this.id=id;
        this.leoiId=id/2;
        this.leofId=gsfId/2;
    }

    public void sendMsgtoGSO(){
        GSOSatellite gso=new GSOSatellite();
        System.out.println(RED_BRIGHT+"LEOSatellite "+id+" thread:"+GREEN_BRIGHT+"This is LEOSatellite "+id+".Sending message to GSOSatellite "+0+ANSI_WHITE);
        counter++;
        Thread geo=new Thread(gso);
        geo.start();
        
    }

    public void sendMsgtoGS(){
        System.out.println(RED_BRIGHT+"LEOSatellite "+id+" thread:"+GREEN_BRIGHT+"This is LEOSatellite "+id+".Sending message to GroundStation "+Satellite.GSarr.get(gsfId).id+ANSI_WHITE);
        Thread gsf=new Thread(Satellite.GSarr.get(gsfId));
        gsf.start();
    }

    public void sendMsgtoLEO(){
        System.out.println(RED_BRIGHT+"LEOSatellite "+id+" thread:"+GREEN_BRIGHT+"This is LEOSatellite "+id+".Sending message to LEOSatellite "+leofId+ANSI_WHITE);
        Thread ls3=new Thread(Satellite.LEOarr.get(leofId));
        counter=2;
        ls3.start();
    }

    @Override
    public void run() {
     if(Math.abs(gsfId/2-gsiId/2)==1&& counter!=2)this.sendMsgtoLEO();
      else if(counter==2||Math.abs(gsfId-gsiId)<=1) this.sendMsgtoGS();
      else if(counter==0)this.sendMsgtoGSO();
      else if(Math.abs(gsfId-gsiId)==2||Math.abs(gsfId-gsiId)==3)this.sendMsgtoLEO();    
    }
}