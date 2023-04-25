package edu.cohenad.assign07;
import edu.cohenad.assign06.Creature;
import edu.cohenad.assign04.CharBoard;

public class Bat extends Creature implements Mover {
    private MoveAlgorithm moveAlg;

    public Bat() {
        super();
        this.moveAlg = new AvoidPlayer();
    }

    public Bat(int row, int col) {
        super(row, col);
        this.moveAlg = new AvoidPlayer();
    }

    public String toString() {
        return "Bat at " + getRow() + "," + getCol();
    }

    public void draw(CharBoard map) {
        map.setPos(getRow(), getCol(), 'B');
    }

    public void performMove(Player p) {
        moveAlg.move(this, p);
    }
}

