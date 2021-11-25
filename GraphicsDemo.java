
import javax.swing.*;

class GraphicsDemo extends JFrame {
  
    GraphicsDemo(JFrame f){
        
        
        DrawingCanvas dc=new DrawingCanvas(800, 600, Constellation.gsiId, Constellation.gsfId);
        f.add(dc);
        f.setVisible(true);  
    }
}