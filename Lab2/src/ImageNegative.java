import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.LookupOp;
import java.awt.image.LookupTable;

public class ImageNegative implements IProcessor{
    @Override
    public BufferedImage process(BufferedImage image) {
        // negative process
        BufferedImage outImage =
                new BufferedImage(image.getWidth(),image.getHeight(),image.getType());
        for(int y=0;y<image.getHeight();y++){
            for(int x=0;x<image.getWidth();x++){
                Color c = new Color(image.getRGB(x, y));
                int b = ((int)(255-c.getRed()) + (int)(255-c.getGreen())
                        +(int)(255-c.getBlue()))/3;
                Color grayColor = new Color(b,b,b);
                outImage.setRGB(x,y,grayColor.getRGB());
            }
        }
        return outImage;
    }

    @Override
    public String name() {
        return "Negative";
    }
}
