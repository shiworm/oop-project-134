
class GSOSatellite extends Constellation implements Runnable {
    boolean receivedMsg;
    public void sendMsgs(){
        LEOSatellite leo=new LEOSatellite(Constellation.leofId);
        System.out.println(RED_BRIGHT+"GSOSatellite "+0+" thread:"+GREEN_BRIGHT+"This is GSO "+0+".Sending message to LEOSatellite "+leo.id+ANSI_WHITE);
        counter++;
        receivedMsg=true;
        Thread ls2=new Thread(leo);
        ls2.start();
    }

    @Override
    public void run() {
       this.sendMsgs();
    }
}

