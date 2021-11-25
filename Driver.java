import java.util.*;
import javax.swing.*;
import java.awt.Color;


public class Driver extends JFrame {
    
    
    public static void main(String args[]){
        
        JFrame f= new JFrame();
        
        f.getContentPane().setBackground(new Color(240,255,255));
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.setTitle("Constellation");
        JLabel title=new JLabel("InterSatellite Link(ISL)",JLabel.CENTER);
        title.setBounds(270,40,200,50); 
        title.setFont (title.getFont ().deriveFont (16.0f));

     

        //title.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel GsO=new JLabel("GSO",JLabel.CENTER);
        GsO.setBounds(345,100,50,30); 
        GsO.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel GS0=new JLabel("GS0", JLabel.CENTER);
        GS0.setBounds(30,300, 50,30);
        GS0.setBorder(BorderFactory.createLineBorder(Color.black));
       
        JLabel GS1=new JLabel("GS1", JLabel.CENTER);
        GS1.setBounds(100,300, 50,30); 
        GS1.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel GS2=new JLabel("GS2", JLabel.CENTER);
        GS2.setBounds(170,300, 50,30); 
        GS2.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel GS3=new JLabel("GS3", JLabel.CENTER);
        GS3.setBounds(240,300, 50,30); 
        GS3.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel GS4=new JLabel("GS4", JLabel.CENTER);
        GS4.setBounds(310,300, 50,30); 
        GS4.setBorder(BorderFactory.createLineBorder(Color.black));
       
        JLabel GS5=new JLabel("GS5", JLabel.CENTER);
        GS5.setBounds(380,300, 50,30); 
        GS5.setBorder(BorderFactory.createLineBorder(Color.black));
       
        JLabel GS6=new JLabel("GS6", JLabel.CENTER);
        GS6.setBounds(450,300, 50,30); 
        GS6.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel GS7=new JLabel("GS7", JLabel.CENTER);
        GS7.setBounds(520,300, 50,30); 
        GS7.setBorder(BorderFactory.createLineBorder(Color.black));
       
        JLabel GS8=new JLabel("GS8", JLabel.CENTER);
        GS8.setBounds(590,300,50,30); 
        GS8.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel GS9=new JLabel("GS9", JLabel.CENTER);
        GS9.setBounds(660,300, 50,30); 
        GS9.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel LEO0=new JLabel("LEO0", JLabel.CENTER);
        LEO0.setBounds(65,200,50,30); 
        LEO0.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel LEO1=new JLabel("LEO1", JLabel.CENTER);
        LEO1.setBounds(205,200,50,30); 
        LEO1.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel LEO2=new JLabel("LEO2", JLabel.CENTER);
        LEO2.setBounds(345,200,50,30); 
        LEO2.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel LEO3=new JLabel("LEO3", JLabel.CENTER);
        LEO3.setBounds(485,200,50,30); 
        LEO3.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel LEO4=new JLabel("LEO4", JLabel.CENTER);
        LEO4.setBounds(625,200,50,30); 
        LEO4.setBorder(BorderFactory.createLineBorder(Color.black));
       
        f.add(GS0);f.add(GS1);f.add(GS2);f.add(GS3);f.add(GS4);f.add(GS5);f.add(GS6);f.add(GS7);f.add(GS8);f.add(GS9);
        f.add(LEO0);f.add(LEO1);f.add(LEO2);f.add(LEO3);f.add(LEO4);
        f.add(GsO);
        f.setSize(800,450);
        f.add(title);
        
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Satellite st=new Satellite();
     
        st.initialize();
    
        while(n!=0){  
            Constellation.gsiId=sc.nextInt();
            Constellation.gsfId=sc.nextInt();
        
           
            GroundStation gs=new GroundStation(Constellation.gsiId);
            Constellation.counter=0;
            Constellation.countergs=0;
            Thread th=new Thread(gs);
            th.start();
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("error");
            }
            n--;
            GraphicsDemo gd= new GraphicsDemo(f);
            
            //if(n==0)System.exit(0);
        }
    }
}
