import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageNegative implements IProcessor{
    @Override
    public BufferedImage process(BufferedImage image) {
        // negative process
        // 출처 : https://raisonde.tistory.com/entry/%ED%8A%B9%EC%A0%95-%EC%83%89%EA%B9%94%EC%9D%98-%EB%B0%98%EC%A0%84-%EC%83%89%EA%B9%94%EB%B0%98%EC%A0%84%EC%83%89-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0
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
