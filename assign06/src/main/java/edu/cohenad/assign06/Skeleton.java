package edu.cohenad.assign06;
import edu.cohenad.assign04.CharBoard;

public class Skeleton extends Creature {

    public Skeleton() {
        super();
    }

    public Skeleton(int row, int col) {
        super(row, col);
    }

    public String toString() {
        return "Skeleton at " + getRow() + "," + getCol();
    }

    public void draw(CharBoard map) {
        map.setPos(getRow(), getCol(), 'S');
    }
}



