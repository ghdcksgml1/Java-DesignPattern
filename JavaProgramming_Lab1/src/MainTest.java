public class MainTest {
    public static void main(String[] args){
        ImageProcessor ip = new ImageProcessor("dog.bmp");
        ip.setImageProcessor(new Grayscale());
        ip.processImage();
        ip.setImageProcessor(new Blur());
        ip.processImage();
        ip.addConverter(new GifConverter());
        ip.addConverter(new PngConverter());
        ip.addConverter(new JpgConverter());
        ip.convertTo("bmp");
        ip.convertTo("jpg");
        ip.convertTo("gif");
        ip.convertTo("png");
    }
}
