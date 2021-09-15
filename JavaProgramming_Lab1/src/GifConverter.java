public class GifConverter extends FormatConverter{
    public GifConverter(){
        super("gif");
    }
    @Override
    public void save(String filenameWithoutExtension) {
        System.out.println("Save image converted to " +filenameWithoutExtension+"."+getExtension());
    }
}
