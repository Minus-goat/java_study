package headFirst_20;

import javax.swing.*;

public class frameDemo {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JButton button = new JButton("CLICK ON ME");
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

}
