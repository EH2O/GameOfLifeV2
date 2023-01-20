package Model;
import java.util.ArrayList;


public class GameMaster {
    int height;
    int width;
    ArrayList<Cell> cells = new ArrayList<>();

    public GameMaster(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public ArrayList<Cell> GenerateCells(){
        for (int i = 1; i < width+1; i++) {
            for (int j = 1; j < height+1; j++) {
                cells.add(new Cell(i,j, false, false));
            }
        }
        return cells;
    }


}
