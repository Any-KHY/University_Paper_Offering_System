import java.util.ArrayList;
import java.util.List;

public class DaraBaseSetUp {



    static void dataBaseSetUp(School school) {

        List<Major> majorList = new ArrayList<>();

        // Majors
        school.addMajor(new Major("CS", "Computer Science")); // 0
        school.addMajor(new Major("IT", "information Technology")); // 1
        school.addMajor(new Major("IS", "Information Systems")); // 2
        school.addMajor(new Major("SE", "Software Engineering")); // 3
        school.addMajor(new Major("DS", "Data Science")); // 4

        // Paper
        majorList.add(school.getMajorList().get(1));
        majorList.add(school.getMajorList().get(2));
        Paper inf158100 = new Paper("Information Technology Principles", "158100",majorList);
        inf158100.addAssessment(new Assessment(Assessment.Type.ASSIGNMENTS, 0.7));
        inf158100.addAssessment(new Assessment(Assessment.Type.TESTS, 0.3));
        school.addPaper(inf158100);
        majorList.clear();

        majorList.add(school.getMajorList().get(1));
        majorList.add(school.getMajorList().get(2));
        Paper wif158120 = new Paper("Web-based IT Fundamentals", "158120",majorList);
        wif158120.addAssessment(new Assessment(Assessment.Type.ASSIGNMENTS, 0.6));
        wif158120.addAssessment(new Assessment(Assessment.Type.TESTS, 0.4));
        school.addPaper(wif158120);
        majorList.clear();

        for (var major: school.getMajorList()) {
            majorList.add(major);
        }
        Paper ap159101 = new Paper("Applied Programming", "159101",majorList);
        ap159101.addAssessment(new Assessment(Assessment.Type.ASSIGNMENTS, 0.5));
        ap159101.addAssessment(new Assessment(Assessment.Type.TESTS, 0.5));
        school.addPaper(ap159101);
        majorList.clear();

        majorList.add(school.getMajorList().get(0));
        majorList.add(school.getMajorList().get(2));
        majorList.add(school.getMajorList().get(3));
        majorList.add(school.getMajorList().get(4));
        Paper ads159201 = new Paper("Algorithms and Data Structures", "159201",majorList);
        ads159201.addAssessment(new Assessment(Assessment.Type.ASSIGNMENTS, 0.4));
        ads159201.addAssessment(new Assessment(Assessment.Type.TESTS, 0.2));
        ads159201.addAssessment(new Assessment(Assessment.Type.EXAMS, 0.4));
        school.addPaper(ads159201);
        majorList.clear();

        majorList.add(school.getMajorList().get(0));
        majorList.add(school.getMajorList().get(3));
        Paper oop159234 = new Paper("Object-Oriented Programming", "159234",majorList);
        oop159234.addAssessment(new Assessment(Assessment.Type.ASSIGNMENTS, 0.5));
        oop159234.addAssessment(new Assessment(Assessment.Type.TESTS, 0.1));
        oop159234.addAssessment(new Assessment(Assessment.Type.EXAMS, 0.4));
        school.addPaper(oop159234);
        majorList.clear();

        majorList.add(school.getMajorList().get(1));
        majorList.add(school.getMajorList().get(3));
        majorList.add(school.getMajorList().get(4));
        Paper dd158337 = new Paper("Database Development", "158337",majorList);
        dd158337.addAssessment(new Assessment(Assessment.Type.ASSIGNMENTS, 0.6));
        dd158337.addAssessment(new Assessment(Assessment.Type.EXAMS, 0.4));
        school.addPaper(dd158337);
        majorList.clear();

        for (var major: school.getMajorList()) {
            majorList.add(major);
        }
        Paper pis158345 = new Paper("Professionalism in the Information Sciences", "158345",majorList);
        pis158345.addAssessment(new Assessment(Assessment.Type.ASSIGNMENTS, 1.0));
        school.addPaper(pis158345);
        majorList.clear();

        // Lecturers
        school.addLecturers(new Lecturer("Amy", "Sheffield","1105236", School.Campus.PALMERSLON_NORTH));
        school.addLecturers(new Lecturer("Victoria", "Jensen","1235894", School.Campus.PALMERSLON_NORTH));
        school.addLecturers(new Lecturer("James", "Lee","7225669", School.Campus.PALMERSLON_NORTH));
        school.addLecturers(new Lecturer("Colin", "Delmont","1328991", School.Campus.PALMERSLON_NORTH));
        school.addLecturers(new Lecturer("Thomas", "Becker","1562347", School.Campus.AUCKLAND));

        school.addLecturers(new Lecturer("Steven", "Hobbs","5664789", School.Campus.AUCKLAND));
        school.addLecturers(new Lecturer("Andrew", "Jackson","3658947", School.Campus.AUCKLAND));
        school.addLecturers(new Lecturer("Jonathon", "Wood","6332698", School.Campus.AUCKLAND));
        school.addLecturers(new Lecturer("Mickey", "Mouse","12345678", School.Campus.AUCKLAND));
    }
}
