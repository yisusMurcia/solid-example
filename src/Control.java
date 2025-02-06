import View.*;
import model.*;
import model.Sphere;

public class Control {
    private final View view;
    private Figure figure;
    private final CubeCreationView cubeCreationView;
    private final SphereCreationView sphereCreationView;
    private final TetrahedronCreationView tetrahedronCreationView;
    private final ParallelepipedCreationView parallelepipedCreationView;

    public Control(){
        view = new View();
        cubeCreationView = new CubeCreationView(view.getScan());
        sphereCreationView = new SphereCreationView(view.getScan());
        tetrahedronCreationView = new TetrahedronCreationView(view.getScan());
        parallelepipedCreationView = new ParallelepipedCreationView(view.getScan());

        int option;

        setFigure();

        do {
            view.showMenu(figure.getName());
            option = view.getOption();

            switch (option) {
                case 1 -> view.displayVolume(figure.getName(), figure.getVolume());
                case 2 -> view.displaySuperficialArea(figure.getName(), figure.getSuperficialArea());
                case 3 -> setFigure();
                case 0 -> view.sayGoodbye();
                default -> view.alertInvalidOption();
            }

        }while (option != 0);
    }

    public void setFigure(){
        view.displayFigureList();
        int option = view.getFigureOption();

        switch (option){
            case 1 -> figure = createCube();
            case 2 -> figure = createSphere();
            case 3 -> figure = createTetrahedron();
            case 4 -> figure = createParallelepiped();
        }
    }


    //Crear la figura de acuerdo al tipo seleccionado
    public Figure createSphere(){
        return new Sphere(sphereCreationView.getRadius());
    }

    public Figure createCube(){
        return new Cube(cubeCreationView.getSide());
    }

    public Figure createTetrahedron(){
        return new Tetrahedron(tetrahedronCreationView.getSide());
    }

    public Figure createParallelepiped(){
        return new Parallelepiped(parallelepipedCreationView.getWidth(), parallelepipedCreationView.getHeigth(), parallelepipedCreationView.getLength());
    }
}
