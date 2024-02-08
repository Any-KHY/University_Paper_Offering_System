import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Major {

    private String shortName;
    private String fullName;

    private List<Paper> paperList = new ArrayList<>();

    public Major(String shortName, String fullName) {
        this.shortName = shortName;
        this.fullName = fullName;
    }

    public void addPaper(Paper newPaper){
        paperList.add(newPaper);
    }

    public List<Paper> getPaperList() {
        return paperList;
    }

    public String getShortName() {
        return shortName;
    }

    public String getFullName() {
        return fullName;
    }

}
