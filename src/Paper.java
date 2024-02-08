import java.util.ArrayList;
import java.util.List;

public class Paper {

    private String name;
    private String code;
    private List<Major> majorList = new ArrayList<>();
    private List<Assessment> assessments = new ArrayList<>();
    private List<Lecturer> lecturers = new ArrayList<>();

    private List<String> teachModes = new ArrayList<> (List.of("Auckland", "PN", "Distance"));

    public Paper(String name, String code, List<Major> majorList) {
        this.name = name;
        this.code = code;
        this.majorList = List.copyOf(majorList);
    }

    static int getCountByAssessmentType (Assessment.Type type, Paper paper, int count) {
        for (var assessment : paper.getAssessments())
            if(assessment.getType().equals(type)) {
                System.out.println("Paper - " + paper.getCode() + " " + paper.getName());
                count++;
            }
        return count;
    }

    static int getCountByAssessmentWeight (double weight, Paper paper, int count) {
        for (var assessment : paper.getAssessments())
            if(assessment.getWeight() > weight) {
                System.out.println("Paper - " + paper.getCode() + " " + paper.getName());
                count++;
            }
        return count;
    }

    public void addAssessment(Assessment newAssessment){
        assessments.add(newAssessment);
    }

    public String printMajorListShortName (){
        String list;
        list = "(";
        for (var major : majorList)
            list+= major.getShortName() + " ";
        list+= ")";
        return list;
    }

    public List<Major> getMajorList() {
        return majorList;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Assessment> getAssessments() {
        return assessments;
    }

    public List<Lecturer> getLecturers() {
        return lecturers;
    }

    public List<String> getTeachModes() {
        return teachModes;
    }
}
