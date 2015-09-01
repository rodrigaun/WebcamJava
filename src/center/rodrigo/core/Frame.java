package center.rodrigo.core;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.github.sarxos.webcam.Webcam;

public class Frame {

    public void saveDemoFrame() {
        
        try {
            Webcam webcam = Webcam.getWebcams().get(0);//pega primeira webcam
            webcam.setViewSize(new Dimension(640, 480));
            webcam.open();
            
            BufferedImage image = webcam.getImage();
        
            ImageIO.write(image, "PNG", new File("teste.png"));
            
            webcam.close();            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
