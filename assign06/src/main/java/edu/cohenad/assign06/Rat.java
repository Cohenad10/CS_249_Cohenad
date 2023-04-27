package edu.cohenad.assign06;


import edu.cohenad.assign04.CharBoard;

public class Rat extends Creature {

    public Rat() {
        super();
    }

    public Rat(int row, int col) {
        super(row, col);
    }

    public String toString() {
        return "Rat at " + getRow() + "," + getCol();
    }

    public void draw(CharBoard map) {
        map.setPos(getRow(), getCol(), 'R');
    }
}




