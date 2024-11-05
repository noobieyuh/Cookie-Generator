package cookie.generator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;


public class Window implements ActionListener
{
    JFrame mainFrame = new JFrame("Cookie Generator :D");
    JButton addCookieButton = new JButton("Press for cookies!!!");
    ImageIcon cookieTitlePicture = new ImageIcon("app\\src\\main\\resources\\pictures\\cookieplus.png");

    Window()
    {
        addCookieButton.setBounds(100, 150, 200, 50);
        addCookieButton.setFocusable(false);
        addCookieButton.addActionListener(this);
        addCookieButton.setBackground(Color.PINK);

        mainFrame.add(addCookieButton);
        mainFrame.setIconImage(cookieTitlePicture.getImage());

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400,400);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);
        mainFrame.setAlwaysOnTop(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == addCookieButton)
        {
            playSound("heavenly.wav");
            TopWindow createCookie = new TopWindow();
        }
    }

public void playSound(String nameSound)
{
    try
    {
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File("app\\bin\\main\\sounds\\" + nameSound).getAbsoluteFile());
        Clip musicClip = AudioSystem.getClip();
        musicClip.open(audioStream);
        musicClip.start();
    }
    catch(Exception error)
    {
        System.out.println("There was an error playing the sound.");
        error.printStackTrace();
    }

}
}
