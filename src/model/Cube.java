package model;

public class Cube extends Figure {
    public Cube(double side) {
        super("Cube", side);
    }

    @Override
    public double getVolume() {
        return Math.pow(length, 3);
    }

    @Override
    public double getSuperficialArea() {
        return 6*Math.pow(length, 2);
    }
}
