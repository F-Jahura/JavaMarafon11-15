package Day12Task4;

import Day12Task5.MusicArtist;

import java.util.List;

public class MusicBand {
    private String groupName;
    private int groupYear;
    private List<String> participants;

    public MusicBand(String groupName, int groupYear, List<String> participants) {
        this.groupName = groupName;
        this.groupYear = groupYear;
        this.participants = participants;
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

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "groupName='" + groupName + '\'' +
                ", groupYear=" + groupYear +
                ", participants=" + participants +
                '}';
    }

    public static void transferMembers(MusicBand musicBandA, MusicBand musicBandB){
        for (String participantsA : musicBandA.getParticipants()){
            musicBandB.getParticipants().add(participantsA);
        }
        musicBandA.getParticipants().clear();
    }

    public void printMembers(){
        System.out.println(getParticipants());
    }
}
