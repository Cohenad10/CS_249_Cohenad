package edu.cohenad.assign07;
import edu.cohenad.assign04.CharBoard;
import edu.cohenad.assign06.Creature;
public class Player extends Creature {

    public Player() {
        super();
    }

    public Player(int row, int col) {
        super(row, col);
    }

    public String toString() {
        return "Player at " + getRow() + "," + getCol();
    }

    public void draw(CharBoard map) {
        map.setPos(getRow(), getCol(), 'P');
    }

}

