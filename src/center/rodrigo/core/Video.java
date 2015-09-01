package center.rodrigo.core;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import com.github.sarxos.webcam.Webcam;

public class Video extends Component {

    private Webcam webcam;
    private JFrame frame;
    private BufferedImage image;
    
    public Video() {
        
        /*Webcam*/
        webcam = Webcam.getWebcams().get(0);//pega primeira webcam
        webcam.setViewSize(new Dimension(640, 480));
        webcam.open();
        
        /*Janela*/
        frame = new JFrame("Java Webcam Video");
        frame.setSize(640, 480);
        frame.add(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawImage(webcam.getImage(), 0, 0, null);
        repaint();
    }
}
