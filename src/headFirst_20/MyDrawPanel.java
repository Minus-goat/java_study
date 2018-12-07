package headFirst_20;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {

        public void paintComponent (Graphics g){
            g.setColor(Color.ORANGE);
            g.fillRect(20,50,100,100);
        }
}


