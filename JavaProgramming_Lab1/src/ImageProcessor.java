import java.util.HashMap;

public class ImageProcessor {
    private IProcessor processor;
    private HashMap<String, FormatConverter> converters;
    private String filename;

    ImageProcessor(String filename){
        String[] file = filename.split("\\."); // filename을 '.'을 기준으로 분리한다.
        this.filename = file[0];
    }

    public void setImageProcessor(IProcessor processor){
        this.processor = processor; // processor를 this.processor에 upcasting 시킨다.
    }

    public void processImage(){
    	// 업캐스팅 되어있는 this.processor의 process method를 실행시키면, 
        // override를 통해 업캐스팅 되기 전의 processor의 process method가 실행된다.
        this.processor.process(this.filename); 
    }

    public void addConverter(FormatConverter converter){
    	// 처음 converter를 추가할경우 this.converters는 null이기 때문에
    	// HashMap을 생성시켜준다.
        if(this.converters == null){
            this.converters = new HashMap<>();
        }
        // put을 통해 key는 확장자명 ex)"jpg" , value는 converter ex)JpgConverter 객체를 넣어준다.
        this.converters.put(converter.getExtension(),converter);
    }
    
    public void convertTo(String ext){
    	// 확장자명이 this.converters에 존재할 경우 this.converters에서
    	// 확장자명으로 key값을 찾아 그 객체의 save함수를 호출시킨다.
    	try {
    		this.converters.get(ext).save(this.filename);
    	}catch(Exception e) {
    		System.out.println("Error! Choose jpg, gif, png!");
    	}
    }
}
