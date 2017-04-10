package G_OpenClosed_Liskov_Lab.P02_FileStream;

public class StreamProgressInfo {
    private Streamable media;

    // If we want to stream a music media, we can't
    public StreamProgressInfo(Streamable file) {
        this.media = file;
    }

    public int calculateCurrentPercent() {
        return (this.media.getBytesSent() * 100) / this.media.getLength();
    }
}
