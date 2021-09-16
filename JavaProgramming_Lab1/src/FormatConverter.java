public abstract class FormatConverter{
    private String ext;

    public FormatConverter(String extension){
        this.ext = extension;
    }

    public String getExtension() {
        return ext;
    }

    public abstract void save(String filenameWithoutExtension);
}

