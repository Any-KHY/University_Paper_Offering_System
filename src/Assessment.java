public class Assessment {

    enum Type {
        ASSIGNMENTS,
        TESTS,
        EXAMS
    }
    private Type type;
    private double weight;

    public Assessment(Type type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public Type getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }
}
