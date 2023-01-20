package Model;

public class Cell {
    int x;
    int y;
    Boolean state;
    Boolean nextState;
    int Neighbours;



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



    public void setNeighbours(int neighbours) {
        Neighbours = neighbours;
    }

    public Cell(int x, int y, Boolean state, Boolean nextState) {
        this.x = x;
        this.y = y;
        this.state = state;
        this.nextState = nextState;
    }

    public void CheckNewState(){
        if(Neighbours < 2){
            nextState = false;
        } else if (Neighbours == 3) {
            nextState = true;
        } else if(Neighbours > 3) {
            nextState = false;
        }
    }
    public void nextScene(){
        state = nextState;
    }
}
