package model;

public class Parallelepiped extends Figure {
    public Parallelepiped(double length, double height, double width) {
        super("Parallelepiped", length, height, width);
    }

    @Override
    public double getVolume() {
        return length*height*width;
    }

    @Override
    public double getSuperficialArea() {
        return 2*(length*height + length*width + height*width);
    }
}
