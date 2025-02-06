package View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SphereCreationView {
    private Scanner scan;

    public SphereCreationView(Scanner scan) {
        this.scan = scan;
    }

    public double getRadius(){
        double radius;
        try {
            System.out.print("Enter the radius of the sphere: ");
            radius = scan.nextDouble();
            if(radius <= 0){
                throw new InputMismatchException();
            }
        }catch (InputMismatchException _){
            System.out.println("Invalid radius, it must be positive");
            scan.next();
            radius = getRadius();
        }

        return radius;
    }
}
