class GroundStation extends Constellation implements Runnable  {
    int id;
   
    GroundStation(int id){
        this.id=id;
        this.leoiId=id/2;
        this.leofId=gsfId/2;
    }

    public void sendMsg(){
        countergs++;
        System.out.println("\n"+RED_BRIGHT+"GroundStation "+id+" thread:"+GREEN_BRIGHT+"This is GroundStation "+id+".Sending message to LEOSatellite "+Satellite.LEOarr.get(leoiId).id+ANSI_WHITE);
        Thread ls2=new Thread(Satellite.LEOarr.get(leoiId));
        ls2.start();
    }

    public void receivedMsg(){
        System.out.println(RED_BRIGHT+"Groundstation "+id+" thread:"+GREEN_BRIGHT+"This is GroundStation "+id+".Recieved message."+ANSI_WHITE);
    }
    
    @Override
    public void run() {
        if(countergs==0)this.sendMsg();
        else if(countergs==1)this.receivedMsg();
    }   
}