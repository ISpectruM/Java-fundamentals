package C_Inheritance.E_OnlineRadioDatabase;

public class Song {
    private String name;
    private String artist;
    private int length;

    public Song( String artist, String name, String length) {
        this.setArtist(artist);
        this.setName(name);
        this.setLength(length);
    }

    private void setName(String name) {
        if(name == null || name.isEmpty() || name.length()<3 || name.length()>30){
            throw new InvalidSongNameException("Song name should be between 3 and 30 symbols.");
        }
        this.name = name;
    }

    private void setArtist(String artist) {
        if ( artist == null || artist.trim().isEmpty() || artist.length() < 3 || artist.length()>20){
            throw new InvalidArtistNameException("Artist name should be between 3 and 20 symbols.");
        }
        this.artist = artist;
    }

    public int getLength() {
        return this.length;
    }

    private void setLength(String length) {
        String[] tokens = length.trim().split(":");
        int minutes = 0;
        int seconds = 0;
        try{
            minutes = Integer.parseInt(tokens[0]);
            seconds = Integer.parseInt(tokens[1]);
        } catch (NumberFormatException nfe){
            throw new InvalidSongLengthException("Invalid song length.");
        }

        if (minutes < 0 || minutes > 14){
            throw new InvalidSongMinutesException("Song minutes should be between 0 and 14.");
        } else if(seconds < 0 || seconds > 59) {
            throw new InvalidSongSecondsException("Song seconds should be between 0 and 59.");
        }

        this.length = minutes*60+seconds;
    }

}
