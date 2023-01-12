package Model;
import java.util.ArrayList;
import java.util.zip.CheckedInputStream;

public class GameMaster {
    int height = 0;
    int width = 0;
    ArrayList<Cell> cells = new ArrayList<>();

    public GameMaster(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public ArrayList GeneratCells(){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                cells.add(new Cell(i,j, false));
            }
        }
        return cells;
    }


}
