package View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParallelepipedCreationView {
    private final Scanner scan;

    public ParallelepipedCreationView(Scanner scan) {
        this.scan = scan;
    }

    public double getHeight(){
        double height;
        try {
            System.out.print("Enter the height of the parallelepiped: ");
            height = scan.nextDouble();
            if(height <= 0){
                throw new InputMismatchException();
            }
        }catch (InputMismatchException _){
            System.out.println("Invalid height, it must be positive");
            scan.nextLine();
            height = getHeight();
        }

        return height;
    }

    public double getWidth(){
        double width;
        try {
            System.out.print("Enter the width of the parallelepiped: ");
            width = scan.nextDouble();
            if(width <= 0){
                throw new InputMismatchException();
            }
        }catch (InputMismatchException _){
            System.out.println("Invalid width, it must be positive");
            scan.nextLine();
            width = getWidth();
        }

        return width;
    }

    public double getLength(){
        double length;
        try {
            System.out.print("Enter the length of the parallelepiped: ");
            length = scan.nextDouble();
            if(length <= 0){
                throw new InputMismatchException();
            }
        }catch (InputMismatchException _){
            System.out.println("Invalid length, it must be positive");
            scan.nextLine();
            length = getLength();
        }

        return length;
    }
}
