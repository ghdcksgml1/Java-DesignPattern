import java.util.HashMap;

public class ImageProcessor {
    private IProcessor processor;
    private HashMap<String, FormatConverter> converters;
    private String filename;

    // complete
    ImageProcessor(String filename){
        this.filename = filename;
    }
    // complete
    public void setImageProcessor(IProcessor processor){
        this.processor = processor;
    }
    // complete
    public void processImage(){
        this.processor.process(this.filename);
    }
    // complete
    public void addConverter(FormatConverter converter){
        if(this.converters == null){
            this.converters = new HashMap<>();
        }
        this.converters.put(converter.getExtension(),converter);
    }
    public void convertTo(String ext){

    }
}
