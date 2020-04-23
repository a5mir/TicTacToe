
package tictactoe;

import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

/**
 *
 * @author asmir465
 */
public class Main {

    public static void main(String[] args) throws InterruptedException, InvocationTargetException{
        
        Runnable myGUI = () -> {
            GameFrame gFrame = new GameFrame();
            gFrame.setVisible(true);
        };
        SwingUtilities.invokeAndWait(myGUI);
        
    }
    
}
