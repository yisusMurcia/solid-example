package View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParallelepipedCreationView {
    private final Scanner scan;

    public ParallelepipedCreationView(Scanner scan) {
        this.scan = scan;
    }

    public double getHeigth(){
        double heigth;
        try {
            System.out.print("Enter the heigth of the parallelepiped: ");
            heigth = scan.nextDouble();
            if(heigth <= 0){
                throw new InputMismatchException();
            }
        }catch (InputMismatchException _){
            System.out.println("Invalid heigth, it must be positive");
            scan.next();
            heigth = getHeigth();
        }

        return heigth;
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
            scan.next();
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
            scan.next();
            length = getLength();
        }

        return length;
    }
}
