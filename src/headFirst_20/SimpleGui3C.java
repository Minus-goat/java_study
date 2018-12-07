package headFirst_20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimpleGui3C implements ActionListener {
    JButton button;
    JFrame frame;
    public static void main(String[] args){
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("CHANGE THE COLORS");

        button.addActionListener(this);
        MyDrawPanel drawPanel = new MyDrawPanel();


        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.getContentPane().add(drawPanel);
        frame.setVisible(true);




    }
    public void actionPerformed(ActionEvent event){
        frame.repaint();
    }
    class MyDrawPanel extends JPanel {

        public void paintComponent (Graphics g){
            /*g.setColor(Color.BLACK);
            g.fillRect(20,50,100,100);*/
            //g.fillRect(0,0,this.getWidth(),this.getHeight());
            Graphics2D g2d = (Graphics2D)g;
            int red = (int)(Math.random()*255);
            int green = (int)(Math.random()*255);
            int blue = (int)(Math.random()*255);
            Color startcolor = new Color(red,green,blue);

            red = (int)(Math.random()*255);
            green = (int)(Math.random()*255);
            blue = (int)(Math.random()*255);
            Color endcolor = new Color(red,green,blue);
            GradientPaint gradient = new GradientPaint(70,70,startcolor,150,150,endcolor);

            g2d.setPaint(gradient);
            g2d.fillOval(70,70,100,100);
            /*g.setColor(randomcolor);
            g.fillRect(70,70,100,100);*/
        }
        /*public void paintComponent(Graphics g){
            Image image = new ImageIcon("catzilla.jpg").getImage();
            g.drawImage(image,3,4,this);
        }*/
    }

}
