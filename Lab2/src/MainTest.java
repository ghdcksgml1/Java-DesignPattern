import java.io.IOException;

public class MainTest {
    // IProcessor interface를 통해 구현한 기능들을 모아둔 배열
    static IProcessor[] processors = {
            new ImageBlur(),
            new ImageEdgeDetect(),
            new ImageGrayscale(),
            new ImageNegative()
    };
    // 이미지 파일경로
    static String[] imageFiles = {"/Users/hongchanhui/Desktop/image1.jpg",
            "/Users/hongchanhui/Desktop/image2.jpg",
            "/Users/hongchanhui/Desktop/image3.jpg"};
    public static void main(String[] args) throws IOException {
        for(IProcessor processor : processors){
            ImageProcessor ip = new ImageProcessor(processor);
            ip.process(imageFiles);
        }
    }
}

