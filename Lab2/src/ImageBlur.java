import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class ImageBlur implements IProcessor{
    @Override
    public BufferedImage process(BufferedImage image) {
        // blur process
        // 출처 : https://stackoverflow.com/questions/31649597/how-to-blur-a-portion-of-an-image-with-java
        float[] matrix = new float[400];
        for (int i = 0; i < 400; i++)
            matrix[i] = 1.0f/500.0f;

        BufferedImage sourceImage =  (BufferedImage) image; ;
        BufferedImage destImage = null ;
        BufferedImageOp op = new ConvolveOp( new Kernel(20, 20, matrix), ConvolveOp.EDGE_NO_OP, null );
        BufferedImage blurredImage = op.filter(sourceImage, destImage);
        return blurredImage;
    }

    @Override
    public String name() {
        return "Blur";
    }
}
