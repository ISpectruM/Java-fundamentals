package C_Inheritance.E_OnlineRadioDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int songsCount = Integer.parseInt(reader.readLine());
        PlayList playList = new PlayList();

        for (int i = 0; i < songsCount; i++) {
            String[] tokens = reader.readLine().split(";");
            try {
                if (tokens.length != 3) {
                    throw new InvalidSongException("Invalid song.");
                }
                String artist = tokens[0];
                String songName = tokens[1];
                String length = tokens[2];

                Song song = new Song(artist,songName,length);
                System.out.println("Song added.");
                playList.addSong(song.getLength());
            }catch (InvalidSongException ise){
                System.out.println(ise.getMessage());
            }
        }

        if (playList.getSongs()==0){
            System.out.println("Songs added: 0");
            System.out.println("Playlist length: 0h 0m 0s");
        } else {
            System.out.println("Songs added: "+playList.getSongs());
            System.out.println("Playlist length: " + playList.toString());
        }

    }
}
