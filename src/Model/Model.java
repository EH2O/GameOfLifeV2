package Model;
import View.*;

public class Model {


    public Model(int width, int height) {

    }

    public void update() {
    }

    public Shape[] getShapes() {
        Point[] points = {new Point(25,5)};
        return (Shape[])points;
    }
}
