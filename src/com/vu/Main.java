package com.vu;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            var input = new File("/home/foo.jpg");
            BufferedImage image = ImageIO.read(input);

            var result = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_BINARY);

            Graphics2D graphic = result.createGraphics();
            graphic.drawImage(image, 0, 0, Color.WHITE, null);
            graphic.dispose();

            var output = new File("/home/BAW.bmp");
            ImageIO.write(result, "bmp", output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
