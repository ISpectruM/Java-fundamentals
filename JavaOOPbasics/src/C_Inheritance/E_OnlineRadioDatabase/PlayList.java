package C_Inheritance.E_OnlineRadioDatabase;

public class PlayList {
    private long length;
    private int songs;

    public PlayList() {
    }

    public int getSongs() {
        return this.songs;
    }

    public void addSong(int length){
        this.length += length;
        this.songs ++;
    }

    @Override
    public String toString() {
        long seconds = this.length % 60;
        long minutes = (this.length % 3600) / 60;
        long hours = (this.length / 3600);
        return String.format("%dh %dm %ds",hours,minutes,seconds);
    }
}
