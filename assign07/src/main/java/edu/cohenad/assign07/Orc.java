package edu.cohenad.assign07;
import edu.cohenad.assign06.Creature;
import edu.cohenad.assign04.CharBoard;

public class Orc extends Creature implements Mover {

    private SeekPlayer seekPlayer;

    public Orc() {
        super();
        seekPlayer = new SeekPlayer();
    }

    public Orc(int row, int col) {
        super(row, col);
        seekPlayer = new SeekPlayer();
    }

    public String toString() {
        return "Orc at " + getRow() + "," + getCol();
    }

    public void draw(CharBoard map) {
        map.setPos(getRow(), getCol(), 'O');
    }

    public void performMove(Player p) {
        seekPlayer.move(this, p);
    }

}


