package Day12Task3;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String groupName;
    private int groupYear;

    public MusicBand(String groupName, int groupYear) {
        this.groupName = groupName;
        this.groupYear = groupYear;
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

    @Override
    public String toString() {
        return "MusicBand{" +
                "groupName='" + groupName + '\'' +
                ", groupYear=" + groupYear +
                '}';
    }
}
