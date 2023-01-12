package Model;

public class Cell {
    int x;
    int y;
    Boolean state = false;
    int Neighbours = 0;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public int getNeighbours() {
        return Neighbours;
    }

    public void setNeighbours(int neighbours) {
        Neighbours = neighbours;
    }

    public Cell(int x, int y, Boolean state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }

    public void CheckNewState(){
        if(Neighbours < 2){
            state = false;
        } else if (Neighbours == 3) {
            state = true;
        } else if(Neighbours > 3) {
            state = false;
        }
    }
}
