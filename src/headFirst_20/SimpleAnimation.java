package headFirst_20;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    int x = 70;
    int y = 70;
    public static void main(String[] args){
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }
    public  void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
        for (int i = 0; i < 130; i++) {
            x++;
            y++;
            drawPanel.repaint();
            try{
                Thread .sleep(50);
            }catch (Exception ex){

            }

        }
    }
    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
           g.setColor(Color.WHITE);
           g.fillOval(0,0,this.getWidth(),this.getHeight());//每次重新画圆的时候，用原来的背景底色填满整个区域添加此行代码可以擦除圆移动痕迹

            g.setColor(Color.MAGENTA);
            g.fillOval(x,y,50,50);
        }
    }
}
