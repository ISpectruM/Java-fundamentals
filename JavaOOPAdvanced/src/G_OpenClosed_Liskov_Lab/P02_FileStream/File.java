package G_OpenClosed_Liskov_Lab.P02_FileStream;

public class File extends Media{
    private String name;

    public File(int length, int bytesSent) {
        super(length, bytesSent);
        this.name = name;
    }
}
