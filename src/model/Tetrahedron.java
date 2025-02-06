package model;

public class Tetrahedron extends Figure {
    public Tetrahedron(double side) {
        super("Tetrahedron", side);
    }

    @Override
    public double getVolume() {
        return Math.pow(length, 3)/6*Math.sqrt(2);
    }

    @Override
    public double getSuperficialArea() {
        return Math.pow(length, 2)*Math.sqrt(3);
    }
}
