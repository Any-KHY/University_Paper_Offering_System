import java.util.ArrayList;
import java.util.List;

public class School {

    enum Campus{
        AUCKLAND,
        PALMERSLON_NORTH
    }

    private final String fullName;
    private final String shortName;
    private List<Major> majorList = new ArrayList<>();
    private List<Paper> paperList = new ArrayList<>();

    private List<Lecturer> lecturerList = new ArrayList<>();

    public School (String fullName, String shortName){
        this.shortName = shortName;
        this.fullName = fullName;
    }

    public void addMajor(Major newMajor){
        majorList.add(newMajor);
    }

    public void addPaper(Paper newPaper){
        paperList.add(newPaper);
    }

    public void addLecturers(Lecturer newLecturer) {
        lecturerList.add(newLecturer);
    }

    void printPaperListFromMajor(Major major) {
        int count = 0;
        System.out.println("Paper Belongs to Major " + major.getShortName() + ":");
        for (var paper : getPaperList()) {
            if(paper.getMajorList().contains(major)){
                System.out.println("Paper - " + paper.getCode() + " " + paper.getName());
                count++;
            }
        }
        System.out.println("Total matching papers in specified Major - " + major.getShortName() + " : " + count);
    }

    void printPaperListByAssessment(Assessment.Type type) {
        int count = 0;
        System.out.println("Paper that have " + type +":");
        for (var paper : paperList) {
            count = Paper.getCountByAssessmentType(type, paper, count);
        }
        System.out.println("Total number of papers that have " + type + " - " + count);
    }

    void printPaperListByAssessment(double weight) {
        int count = 0;
        System.out.println("Paper that their assignments weigh higher than " + weight*100 + "%:");
        for (var paper : paperList) {
            count = Paper.getCountByAssessmentWeight(weight, paper, count);
        }
        System.out.println("Total number of papers that have assignments weighted more than  " + weight*100 + "%: " + count);
    }

    void paperOffering(){

    }

    public List<Major> getMajorList() {
        return majorList;
    }

    public List<Paper> getPaperList() {
        return paperList;
    }

    public List<Lecturer> getLecturerList() {
        return lecturerList;
    }

    @Override
    public String toString() {
        return fullName + "(" +shortName + ")";
    }
}
