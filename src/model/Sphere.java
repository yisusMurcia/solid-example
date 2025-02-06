package model;

public class Sphere extends Figure {
    public Sphere(double radius) {
        super("Circle", radius);
    }

    @Override
    public double getVolume() {
        return 4*Math.PI*Math.pow(length, 3)/3;
    }

    @Override
    public double getSuperficialArea() {
        return 4*Math.PI*Math.pow(length, 2);
    }
}
