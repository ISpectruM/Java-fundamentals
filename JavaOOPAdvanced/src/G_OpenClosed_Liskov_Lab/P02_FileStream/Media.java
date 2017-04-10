package G_OpenClosed_Liskov_Lab.P02_FileStream;

public abstract class Media implements Streamable{

    private int length;
    private int bytesSent;

    public Media(int length, int bytesSent) {
        this.length = length;
        this.bytesSent = bytesSent;
    }

    public int getLength() {
        return this.length;
    }

    public int getBytesSent() {
        return this.bytesSent;
    }

}
