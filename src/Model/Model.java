package Model;
import View.*;
import java.util.ArrayList;


public class Model {
    ArrayList<Cell> cells;
    int width;
    int height;
    int count;
    int test = 0;

    public Model(int width, int height) {
        GameMaster GenCell = new GameMaster(width, height);
        this.width = width;
        this.height = height;
        cells = GenCell.GenerateCells();
        for (int i = 1; i < width/2; i++) {
            cells.get(i*height+width/2).setState(true);

        }


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
        for (Cell cell : cells) {
            cell.nextScene();
        }
    }

    private int NeighbourCheck(int i){

        if (cells.get(i).getY() != 1 && cells.get(i).getX() != 1 && cells.get(i).getX() != width){
                for (int j = 0; j < 3; j++) {
                    if (cells.get(i-1+j-height).getState()){
                        test++;
                    }
                }
            }
        if (cells.get(i).getY() != height && cells.get(i).getX() != 1 && cells.get(i).getX() != width){
            for (int j2 = 0; j2 < 3; j2++) {
                if (cells.get(i-1+j2+height).getState()){
                    test++;
                }
            }
        }
        if(cells.get(i).getX() != 1 && cells.get(i).getX() != width){
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
        ArrayList<Point> points = new ArrayList<>();
        for (Cell cell : cells) {
            if (cell.state) {
                points.add(new Point(cell.getY(), cell.getX()));
            }
        }
        return points.toArray(new Point[0]);
    }
}
