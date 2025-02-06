package View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {//Clase encargada de saludar al usuario y mostrar las funcionalidades del programa
    private final Scanner scan;

    public View() {
        scan = new Scanner(System.in);
        System.out.println("Welcome to the geometric figures program by Jesús Antonio Murcia");
    }

    //Pasar el scanner a las vistas de creación de figuras, para evitar errores
    public Scanner getScan() {
        return scan;
    }

    public void showMenu(String figureName) {
        System.out.println("Choose an option:");
        System.out.println("1. Calculate the volume of the " + figureName);
        System.out.println("2. Calculate the superficial area of the " + figureName);
        System.out.println("3. Set new figure");
        System.out.println("\t0. Exit");
    }

    //La creación de figuras se hace desde otra vistas, depende de la selección de la figura
    public void displayFigureList(){
        System.out.println("Choose a figure:");
        System.out.println("1. Cube");
        System.out.println("2. Sphere");
        System.out.println("3. Tetrahedron");
        System.out.println("4. Parallelepiped");
    }

    public int getFigureOption(){
        int option;
        try {
            System.out.print("Option: ");
            option = scan.nextInt();
            if(option < 1 || option > 4){
                throw new InputMismatchException();
            }
        }catch (InputMismatchException _){
            System.out.println("Invalid option");
            scan.next();
            option = getFigureOption();
        }

        return option;
    }

    public int getOption(){
        int option;
        try {
            System.out.print("Option: ");
            option = scan.nextInt();
        }catch (InputMismatchException _){
            System.out.println("Invalid option");
            scan.next();
            option = getOption();
        }

        return option;
    }

    public void alertInvalidOption(){
        System.out.println("Invalid option");
    }

    public void sayGoodbye(){
        System.out.println("Thanks for using the program, have a nice day!");
        scan.close();
    }

    public void displayVolume(String name, double volume){
        System.out.println("The volume of the " + name + " is: " + volume);
    }

    public void displaySuperficialArea(String name, double superficialArea){
        System.out.println("The superficial area of the " + name + " is: " + superficialArea);
    }
}
