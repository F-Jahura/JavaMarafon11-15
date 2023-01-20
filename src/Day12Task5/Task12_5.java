package Day12Task5;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class Task12_5 {
    public static void main(String[] args) {
        List<MusicArtist> musicArtistList1 = new ArrayList<>();

        MusicArtist musicArtist1 = new MusicArtist("Myles Kennedy", 26);
        MusicArtist musicArtist2 = new MusicArtist("Mark Tremonti", 42);
        MusicArtist musicArtist3 = new MusicArtist("Scott Phillips", 47);
        MusicArtist musicArtist4 = new MusicArtist("Brian Marshall", 20);

        musicArtistList1.add(musicArtist1);
        musicArtistList1.add(musicArtist2);
        musicArtistList1.add(musicArtist3);
        musicArtistList1.add(musicArtist4);

        MusicBand musicBand = new MusicBand("Alter Bridge", 2004, musicArtistList1);

        List<MusicArtist> musicArtistList2 = new ArrayList<>();

        MusicArtist musicArtist5 = new MusicArtist("Jimmy Allen", 50);
        MusicArtist musicArtist6 = new MusicArtist("Mark Bistany", 19);
        MusicArtist musicArtist7 = new MusicArtist("Mizzy Pacheco", 32);

        musicArtistList2.add(musicArtist5);
        musicArtistList2.add(musicArtist6);
        musicArtistList2.add(musicArtist7);

        MusicBand musicBand2 = new MusicBand("Against All Will", 2009, musicArtistList2);

        musicBand.printArtists();
        musicBand2.printArtists();

        MusicBand.transferArtists(musicBand, musicBand2);
        musicBand.printArtists();
        musicBand2.printArtists();


    }
}
