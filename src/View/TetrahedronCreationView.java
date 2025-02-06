package View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TetrahedronCreationView {
    private Scanner scan;

    public TetrahedronCreationView(Scanner scan) {
        this.scan = scan;
    }

    public double getSide(){
        double side;
        try {
            System.out.print("Enter the side of the tetrahedron: ");
            side = scan.nextDouble();
            if(side <= 0){
                throw new InputMismatchException();
            }
        }catch (InputMismatchException _){
            System.out.println("Invalid side, it must be positive");
            scan.nextLine();
            side = getSide();
        }

        return side;
    }
}
