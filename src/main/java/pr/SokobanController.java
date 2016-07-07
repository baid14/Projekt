package pr;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
import javax.swing.JFrame;
 


public class SokobanController extends JFrame implements KeyListener {
 
	char c;
    public SokobanController() {
    
    }
    
    public void appletakl()
    {
    	  SokobanView.applet.addKeyListener(this);
    }

 
    public void keyPressed(KeyEvent evt) {
    	   c = evt.getKeyChar();
    switch(c)
    {
    case 'w':
    	SokobanModel.ifw();
    	System.out.println("w");
    	break;
    case 'a':
    	SokobanModel.ifa();
    	break;
    case 's':
    	 SokobanModel.ifs();
    	break;
    case 'd':
    	SokobanModel.ifd();
    	 break;
                
    }
    
    
    }
 
    public void keyReleased(KeyEvent evt) {
     
    }
 
    public void keyTyped(KeyEvent evt) {
 
    }

    


}
 
   