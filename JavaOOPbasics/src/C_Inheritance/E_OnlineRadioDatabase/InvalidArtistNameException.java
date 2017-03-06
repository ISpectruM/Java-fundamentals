package C_Inheritance.E_OnlineRadioDatabase;

public class InvalidArtistNameException extends InvalidSongException{
    public InvalidArtistNameException(String s){
        super(s);
    }
}
