package Model;
import java.util.ArrayList;
public class GameMaster {
    public ArrayList<Model.Cell> getCells() {
        ArrayList<Points>

        return cells;
    }

    ArrayList<Cell> cells;
    public void GeneratCells(int Width, int Height){
        for (int i = 0; i < Width; i++) {
            for (int j = 0; j < Height; j++) {
                cells.add(new Cell(i,j, true));
            }
        }
    }


}
