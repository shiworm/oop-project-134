
import javax.swing.JComponent;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.Color;
import java.util.Random;
class DrawingCanvas extends JComponent{
    int width;
    int height;
    int gsi,gsf,leoi,leof;
    
    public DrawingCanvas(int w,int h,int gsiId, int gsfId){
        width=w;
        height=h;
        gsi=gsiId;
	    gsf=gsfId;
	    leoi=gsi/2;
	    leof=gsf/2;
    }
    public void paintComponent(Graphics g){
       
        Random r=new Random();
        

        Graphics2D g2d=(Graphics2D)g;
        g2d.setStroke(new BasicStroke(7));
        //Image img = Toolkit.getDefaultToolkit().getImage("Capture.jpg");
        float alpha = 0.9f;
        Color color = new Color(1, 0, 0, alpha); //Red 
        g2d.setPaint(color);
        g2d.setColor(new Color(r.nextFloat(),r.nextFloat()/2f+0.5f,r.nextFloat()/2f+0.5f));
       // g2d.setXORMode(Color.black);
        //g2d.drawImage(img, 0, 0, null);

        if(leoi==leof){
            int st1x=55+(70*gsi);
            int st2x=90+(140*leoi);
            Line2D.Double line1=new Line2D.Double(st1x,300,st2x,230);
            g2d.drawString("msg", (st1x+st2x)/2, (300+230)/2);
            
            g2d.draw(line1);

            int st3x=55+(70*gsf);
            int st4x=90+(140*leof);
            Line2D.Double line2=new Line2D.Double(st4x,230,st3x,300);
            g2d.drawString("msg", (st4x+st3x)/2, (300+230)/2);
            g2d.draw(line2);
        } else if(Math.abs(leof-leoi)==1){
            int st1x=55+(70*gsi);
            int st2x=90+(140*leoi);
            Line2D.Double line1=new Line2D.Double(st1x,300,st2x,230);
            g2d.drawString("msg", (st1x+st2x)/2, (300+230)/2);
            g2d.draw(line1);

            int st3x=115+(140*leoi);
            if(leoi>leof){
                st3x=115+(140*leof);
            }
            int st4x=st3x+90;
            Line2D.Double line2=new Line2D.Double(st3x,215,st4x,215);
            g2d.drawString("msg", (st3x+st4x)/2, (215+215)/2);
            g2d.draw(line2);

            int st5x=55+(70*gsf);
            int st6x=90+(140*leof);
            Line2D.Double line3=new Line2D.Double(st6x,230,st5x,300);
            g2d.drawString("msg", (st5x+st6x)/2, (300+230)/2);
            g2d.draw(line3);
        } else{
            int st1x=55+(70*gsi);
            int st2x=90+(140*leoi);
            Line2D.Double line1=new Line2D.Double(st1x,300,st2x,230);
            g2d.drawString("msg", (st1x+st2x)/2, (300+230)/2);
            g2d.draw(line1);

            Line2D.Double line2=new Line2D.Double(st2x,200,370,130);
            g2d.drawString("msg", (st1x+370)/2, (200+130)/2);
            g2d.draw(line2);

            int st5x=90+(140*leof);
            Line2D.Double line3=new Line2D.Double(370,130,st5x,200);
            g2d.drawString("msg", (370+st5x)/2, (200+130)/2);
            g2d.draw(line3);

            int st6x=55+(70*gsf);
            Line2D.Double line4=new Line2D.Double(st6x,300,st5x,230);
            g2d.drawString("msg", (st6x+st5x)/2, (300+230)/2);
            g2d.draw(line4);
        }
        
    }
}