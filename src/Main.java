import java.util.List;

public class Main {

    public static Lecturer randomAssign(List<Lecturer> lecturerList){
        int random = (int) (Math.random() * lecturerList.size());
        return lecturerList.get(random);
    }

    public static void main(String[] args) {

        // create School instance
        School abcCollege = new School("ABC College", "ABC");
        DaraBaseSetUp.dataBaseSetUp(abcCollege);

        System.out.println("\n------------------ Task 1 ------------------");
        System.out.println("School Name: " + abcCollege);

        System.out.println("\n------------------ Task 2 ------------------");
        System.out.println("All paper details:");
        for (var paper : abcCollege.getPaperList()) {
            System.out.println(paper.getCode() + "\t" + paper.getName() + " " + paper.printMajorListShortName());
        }

        System.out.println("\n------------------ Task 3 ------------------");
        abcCollege.printPaperListFromMajor(abcCollege.getMajorList().get(0));

        System.out.println("\n------------------ Task 4 ------------------");
        abcCollege.printPaperListByAssessment(Assessment.Type.TESTS);

        System.out.println("\n------------------ Task 5 ------------------");
        abcCollege.printPaperListByAssessment(0.5);

        System.out.println("\n------------------ Task 6 ------------------");
        offerPaper(abcCollege);

        System.out.println("\n------------------ Task 7 ------------------");
        printMessage(abcCollege, "Mickey Mouse");

        System.out.println("\n------------------ Task 8 ------------------");
        printMessage("Distance", "159234", abcCollege);
    }


    private static void offerPaper(School abcCollege) {
        System.out.println("Paper offering details:");
        for (int i=0 ; i<3 ; i++) {
            for (var paper : abcCollege.getPaperList()) {
                Lecturer l;
                do{
                    l = randomAssign(abcCollege.getLecturerList());
                }
                while(l.getPaperCount()>=4);
                paper.getLecturers().add(l);
                l.addPaperCount();
                System.out.println(paper.getCode() + "\t" + paper.getTeachModes().get(i) + "\t" + l.toString());
            }
        }
    }

    private static void printMessage(String campus, String target, School abcCollege) {
        System.out.println("The lecturer of " + campus + " offering of " + target + ":");
        int index;
        for (var paper : abcCollege.getPaperList()){
            if(paper.getCode().equals(target)){
                switch (campus){
                    case "Auckland" :
                        index = 0;
                        printMessage(paper, index);
                        break;
                    case "PN":
                        index = 1;
                        printMessage(paper, index);
                        break;
                    case "Distance":
                        index = 2;
                        printMessage(paper, index);
                        break;
                    default:
                        System.out.println("No such teaching mode");
                        break;
                }
            }
        }
    }

    private static void printMessage(School abcCollege, String target) {
        System.out.println("Paper that " + target + "teach:");
        int count = 0;
        for (var paper : abcCollege.getPaperList())
            for (int i=0; i<3; i++){
                if(paper.getLecturers().get(i).toString().equals(target)){
                    System.out.println("Paper Offering  - " + paper.getCode() + "\t" +
                                        paper.getTeachModes().get(i) +  "\t\tLecturer: " + paper.getLecturers().get(i).toString());
                    count++;
                }
            }
        System.out.println( target + " is teaching " + count + " paper(s)");
    }

    private static void printMessage(Paper paper, int index) {
        System.out.println("Lecturer's Name: " + paper.getLecturers().get(index));
        System.out.println("This Lecturer is teaching " + paper.getLecturers().get(index).getPaperCount());
    }

}