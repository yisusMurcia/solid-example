package model;

public abstract class Figure {
    //Clase abstracta para todas las figuras geométricas

    //Atributos necesarios para todas las figuras
    protected String name;
    protected double length;
    protected double height;
    protected double width;

    //Polimorfismo para las diferentes figuras
    public Figure(String nombre, double length, double height, double width) {
        this.name = nombre;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Figure(String nombre, double side) {
        this.name = nombre;
        this.length = side;
        this.height = side;
        this.width = side;
    }

    public String getName() {
        return name;
    }

    public abstract double getVolume();

    public abstract double getSuperficialArea();
}
