public class Resistor {
    private int value;
    private double tolerance;

    public Resistor(int value, double tolerance) {
        this.value = value;
        this.tolerance = tolerance;
    }

    public int getValue() {
        return value;
    }

    public double getTolerance() {
        return tolerance;
    }
}
