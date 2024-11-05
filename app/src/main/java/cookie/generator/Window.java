package cookie.generator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;


public class Window implements ActionListener
{
    JFrame mainFrame = new JFrame("Cookie Generator :D");
    JButton addCookieButton = new JButton("Press for cookies!!!");
    ImageIcon cookieTitlePicture = new ImageIcon("app\\src\\main\\resources\\pictures\\cookieplus.png");
    ImageIcon mainTitlePicture = new ImageIcon("app\\src\\main\\resources\\pictures\\mainpic.png");
    JLabel mainDisplay = new JLabel(mainTitlePicture);
    JLabel mainText = new JLabel("hi there want cookie click button");
    JLabel secondText = new JLabel("whoever you are, i think youre awesome");

    Window()
    {
        addCookieButton.setBounds(100, 275, 200, 50);
        addCookieButton.setFocusable(false);
        addCookieButton.addActionListener(this);
        addCookieButton.setBackground(Color.PINK);

        mainDisplay.setSize(200, 200);
        mainDisplay.setLocation(100, 65);

        mainText.setBounds(110, 0, 200, 100);
        secondText.setBounds(90, 290, 250, 100);
        
        mainFrame.add(mainDisplay);
        mainFrame.add(addCookieButton);
        mainFrame.add(mainText);
        mainFrame.add(secondText);

        mainFrame.getContentPane().setBackground(Color.WHITE);
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
        System.out.println("There was an error playing the sound. Whoopsie...");
        error.printStackTrace();
    }

}
}
