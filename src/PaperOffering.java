import java.util.ArrayList;
import java.util.List;

public class PaperOffering {

    private School school;

    private List<Lecturer> lecturerList = new ArrayList<>();
    private List<Paper> paperList = new ArrayList<>();

    public PaperOffering(School school, List<Lecturer> lecturerList, List<Paper> paperList) {
        this.school = school;
        this.lecturerList = lecturerList;
        this.paperList = paperList;
    }
}
