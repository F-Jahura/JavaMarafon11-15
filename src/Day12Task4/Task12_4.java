package Day12Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task12_4 {
    public static void main(String[] args) {
        List<String> participantsList1 = new ArrayList<>(Arrays.asList("Myles Kennedy", "Mark Tremonti", "Scott Phillips",
                "Brian Marshall"));

        MusicBand musicBand1 = new MusicBand("Alter Bridge", 2004, participantsList1);

        List<String> participantsList2 = new ArrayList<>(Arrays.asList("Jimmy Allen", "Mark Bistany", "Mizzy Pacheco"));

        MusicBand musicBand2 = new MusicBand("Against All Will", 2009, participantsList2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
