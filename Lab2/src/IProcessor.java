import java.awt.image.BufferedImage;
import java.io.IOException;

public interface IProcessor {
    // IProcessor를 통해 blur, edgeDetect... 등과 같은
    // 클래스들의 인터페이스를 정의한다.
    public BufferedImage process(BufferedImage image) throws IOException;
    public String name();
}
