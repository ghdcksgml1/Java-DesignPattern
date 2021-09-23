import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageProcessor {
    // Strategy Pattern
    private IProcessor processor = null;

    // 생성자
    public ImageProcessor(IProcessor processor) {
        this.processor = processor;
    }

    // IProcessor를 변경하는 메소드
    public void setImageProcessor(IProcessor processor){
        this.processor = processor;
    }

    // method Overloading
    public void process(String filename) throws IOException {
        BufferedImage image = ImageUtil.load(filename); // filename 읽기
        // processor에 upcasting 형태로 저장되어 있는 클래스의
        // Override된 process method를 실행시킨다.
        BufferedImage oImage = processor.process(image);
        String format = ImageUtil.getExtension(filename); // 확장자명 가져오기
        String oFile = // 파일 이름짓기
                ImageUtil.getFullpathWithoutExt(filename)
                + processor.name() + "."
                + ImageUtil.getExtension(filename);
        ImageUtil.save(oImage, format, oFile); // 설정한 이름과 형태로 저장하기
    }

    // method Overloading
    public void process(String[] filename) throws IOException {
        // for-each구문을 통해 filename배열의 지정된 형태의 processor의 동작을 실행시킨다.
        for(String file : filename){
            process(file);
        }
    }
}

