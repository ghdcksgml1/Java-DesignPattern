public class JpgConverter extends FormatConverter{
    public JpgConverter(){
        super("jpg");
    }
    @Override
    public void save(String filenameWithoutExtension) {
        System.out.println("Save image converted to " +filenameWithoutExtension+"."+getExtension());
    }
}

