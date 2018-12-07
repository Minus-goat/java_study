package headFirst_20;

import javafx.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TwoButtons {
    JFrame frame;
    JLabel label;
    public static void  main(String[] args){
        TwoButtons gui = new TwoButtons();
        gui.go();
    }
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("CHANGE THE LABEL");
       // labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("change the circle");
       // colorButton.addActionListener(new ColorListener());

        label = new JLabel("I AM LABEL");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH,colorButton);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.getContentPane().add(BorderLayout.EAST,labelButton);
        frame.getContentPane().add(BorderLayout.WEST,label);

        frame.setSize(300,300);
        frame.setVisible(true);

        /*class LabelListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                label.setText("ouch");
            }
        }
        class ColorListener implements ActionListener{
            public  void actionPerformed(ActionEvent event){
            frame.repaint();
            }
        }*/
    }
}
