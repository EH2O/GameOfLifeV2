package Model;
import View.*;
import java.util.ArrayList;


public class Model {
    ArrayList<Cell> cells;

    public Model(int width, int height) {
        GameMaster test = new GameMaster(width, height);
        cells = test.GeneratCells();
        cells.get(120).setState(true);
        cells.get(170).setState(true);
    }

    public void update() {

    }

    public Shape[] getShapes() {
        ArrayList<Point> points = new ArrayList<Point>();
        for (int i = 0; i < cells.size(); i++) {
            if (cells.get(i).state){
                points.add(new Point(cells.get(i).y,cells.get(i).x));
            }
        }
        Point[] pointsAr = points.toArray(new Point[0]);
        return (Shape[])pointsAr;
    }
}
