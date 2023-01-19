package Model;
import View.*;
import java.util.ArrayList;


public class Model {
    ArrayList<Cell> cells;
    int width = 0;
    int height = 0;
    int count = 0;
    int test = 0;

    public Model(int width, int height) {
        GameMaster test = new GameMaster(width, height);
        this.width = width;
        this.height = height;
        cells = test.GeneratCells();
        cells.get(171).setState(true);
        cells.get(170).setState(true);
        cells.get(220).setState(true);
        cells.get(169).setState(true);

        update();
    }

    public void update() {
        countCellNeighbours();
    }
    public void countCellNeighbours(){
        for (int i = 0; i < cells.size(); i++) {
            count += NeighbourCheck(i);
            test = 0;
            cells.get(i).setNeighbours(count);
            count = 0;
            cells.get(i).CheckNewState();
        }
        for (int i = 0; i < cells.size(); i++) {
            cells.get(i).nextScene();
        }
    }

    private int NeighbourCheck(int i){

        if (cells.get(i).getY() != 1 && cells.get(i).getX() != 1 && cells.get(i).getX() != 50){
                for (int j = 0; j < 3; j++) {
                    if (cells.get(i-1+j-50).getState()){
                        test++;
                    }
                }
            }
        if (cells.get(i).getY() != 50 && cells.get(i).getX() != 1 && cells.get(i).getX() != 50){
            for (int j2 = 0; j2 < 3; j2++) {
                if (cells.get(i-1+j2+50).getState()){
                    test++;
                }
            }
        }
        if(cells.get(i).getX() != 1 && cells.get(i).getX() != 50){
            if(cells.get(i-1).getState()){
                test++;
            }
            if(cells.get(i+1).getState()){
                test++;
            }
        }



        return test;
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
