public class Lecturer {

    private final String[] name = new String[2];
    private final String id;
    private School.Campus location;
    private Boolean distance;

    private int paperCount;

    public Lecturer(String firstName, String lastName, String id, School.Campus location) {
        this.name[0] = firstName;
        this.name[1] = lastName;
        this.id = id;
        this.location = location;
        paperCount = 0;
    }

    @Override
    public String toString() {
        return name[0] + " " + name[1];
    }


    public void addPaperCount() {
        paperCount++;
    }

    public String[] getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public School.Campus getLocation() {
        return location;
    }

    public int getPaperCount() {
        return paperCount;
    }
}
