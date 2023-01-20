package Day12Task3;

import java.util.ArrayList;
import java.util.List;

public class Task12_3 {
    public static void main(String[] args) {
        List<MusicBand> bandList = new ArrayList<>();

        bandList.add(new MusicBand("The Silk Road Ensemble", 2000));
        bandList.add(new MusicBand("Blind Faith", 1969));
        bandList.add(new MusicBand("Symfonia", 2011));
        bandList.add(new MusicBand("Son of Sam", 2001));
        bandList.add(new MusicBand("Honey Cone", 1968));
        bandList.add(new MusicBand("new Race", 1981));
        bandList.add(new MusicBand("Against All Will", 2009));
        bandList.add(new MusicBand("Another Animal", 2007));
        bandList.add(new MusicBand("We are the Fallen", 2010));
        bandList.add(new MusicBand("Temple of the Dog", 1990));

        System.out.println("All music groups: " +bandList);


        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand musicBand : bandList){
            if (musicBand.getGroupYear() > 2000){
                groupsAfter2000.add(musicBand);
            }
        }
        System.out.println("Groups after 2000: " + groupsAfter2000);

    }

}
