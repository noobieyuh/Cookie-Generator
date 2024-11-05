package cookie.generator;

import java.lang.Math;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class TopWindow {
    
    JFrame cookieFrame = new JFrame("Here's a cookie!");
    ImageIcon windowPicture = new ImageIcon("app\\src\\main\\resources\\pictures\\cookieplus.png");
    ImageIcon bigCookie = new ImageIcon("app\\src\\main\\resources\\pictures\\cookie.jpg");
    JLabel display = new JLabel(bigCookie);

    TopWindow()
    {
        cookieFrame.setIconImage(windowPicture.getImage());

        cookieFrame.add(display);
        display.setSize(300, 275);

        cookieFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cookieFrame.setSize(300,300);
        cookieFrame.setLayout(null);
        cookieFrame.setVisible(true);
        cookieFrame.setResizable(false);

        int randomX = (int) (Math.random() * 1400) + 100;
        int randomY = (int) (Math.random() * 500) + 100;

        cookieFrame.setLocation(randomX, randomY);

    }
}
