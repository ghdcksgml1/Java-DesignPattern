public class PngConverter extends FormatConverter{
    public PngConverter(){
        super("png");
    }
    @Override
    public void save(String filenameWithoutExtension) {
        System.out.println("Save image converted to " +filenameWithoutExtension+"."+getExtension());
    }
}

