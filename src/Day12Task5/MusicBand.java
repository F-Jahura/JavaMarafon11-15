package Day12Task5;

import java.util.List;

public class MusicBand {
    private String groupName;
    private int groupYear;
    List<MusicArtist> musicArtists;

    public MusicBand(String groupName, int groupYear, List<MusicArtist> musicArtists) {
        this.groupName = groupName;
        this.groupYear = groupYear;
        this.musicArtists = musicArtists;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupYear() {
        return groupYear;
    }

    public void setGroupYear(int groupYear) {
        this.groupYear = groupYear;
    }

    public List<MusicArtist> getMusicArtists() {
        return musicArtists;
    }

    public void setMusicArtists(List<MusicArtist> musicArtists) {
        this.musicArtists = musicArtists;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "groupName='" + groupName + '\'' +
                ", groupYear=" + groupYear +
                ", musicArtists=" + musicArtists +
                '}';
    }

    public static void transferArtists(MusicBand musicBandA, MusicBand musicBandB){
        for (MusicArtist artistA : musicBandA.getMusicArtists()){
            musicBandB.getMusicArtists().add(artistA);
        }
        musicBandA.getMusicArtists().clear();
    }

    public void printArtists(){
        System.out.println(getMusicArtists());
    }
}
