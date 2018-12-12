package section9.lecture96;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums= new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Ed's Album", "Ed Sheeran");
        album.addSong("Thinking Out Loud", 3.22);
        album.addSong("Castle on the Hill", 4.10);
        album.addSong("Don't", 4.17);
        album.addSong("Happier", 3.56);
        album.addSong("Photograph", 4.34);
        album.addSong("Sing", 5.12);
        album.addSong("Galway Girl", 4.35);
        album.addSong("Lego House", 4.25);
        albums.add(album);

        album = new Album("Adele's Album", "Adele");
        album.addSong("Rolling in the Deep", 4.52);
        album.addSong("Rumour has it", 3.45);
        album.addSong("Someone Like You", 4.45);
        album.addSong("Turning Tables", 4.34);
        album.addSong("Lovesong", 5.04);
        album.addSong("Make You Feel My Love", 3.58);
        album.addSong("Hello", 4.28);
        album.addSong("Take It All", 4.44);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).canAddToPlaylist("Don't",playlist);
        albums.get(0).canAddToPlaylist("Thinking Out Loud",playlist);
        albums.get(0).canAddToPlaylist("Photograph",playlist);
        albums.get(1).canAddToPlaylist("Someone Like You",playlist);
        albums.get(1).canAddToPlaylist("Make You Feel My Love",playlist);
        albums.get(1).canAddToPlaylist("Happier",playlist);

        albums.get(0).canAddToPlaylist(1, playlist);
        albums.get(0).canAddToPlaylist(6, playlist);
        albums.get(0).canAddToPlaylist(14, playlist);

        play(playlist);
    }

    private static void play(LinkedList<Song>lists){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song>listIterator = lists.listIterator();
        if(lists.size() == 0){
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().getTitle());
        }

    }

}


// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listIterator.remove()