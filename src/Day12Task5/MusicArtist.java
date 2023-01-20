package Day12Task5;

public class MusicArtist {
    private String artistName;
    private int artistAge;

    public MusicArtist(String artistName, int artistAge) {
        this.artistName = artistName;
        this.artistAge = artistAge;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getArtistAge() {
        return artistAge;
    }

    public void setArtistAge(int artistAge) {
        this.artistAge = artistAge;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "artistName='" + artistName + '\'' +
                ", artistAge=" + artistAge +
                '}';
    }
}
