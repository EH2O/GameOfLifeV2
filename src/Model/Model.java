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
            count += NeightbourCheck1(i,0);
            count += NeightbourCheck1(i,100);
            count += NeightbourCheck2(i);
            if (count !=0){
                System.out.println(count);
            }
            count = 0;
            test = 0;

        }
    }
    private int NeightbourCheck2(int i){
        for (int j = 0; j < 3; j++) {
            if(cells.get(i).x+1  > width || cells.get(i).x - 1 < 0){
                continue;
            }else {
                if (cells.get(i-1+j).getState()){
                    test++;
                }
            }
        }
        return test;
    }
    private int NeightbourCheck1(int i, int Height){
        for (int j = 0; j < 3; j++) {
            if(cells.get(i).x+1  > width || cells.get(i).x - 1 < 0){
                continue;
            }else {
                if(cells.get(i).y + + 1  > height || cells.get(i).y-1 < 0) {
                    continue;
                }else {
                    if(cells.get(i-1+j).getState()){
                        test++;

                    }
            }
        }}
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
