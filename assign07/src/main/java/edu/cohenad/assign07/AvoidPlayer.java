package edu.cohenad.assign07;
import edu.cohenad.assign06.Creature;

public class AvoidPlayer implements MoveAlgorithm {

    public void move(Creature current, Player p) {
        int rowDiff = p.getRow() - current.getRow();
        int colDiff = p.getCol() - current.getCol();

        if (rowDiff == 0 && colDiff == 0) {
            return;
        }

        if (Math.abs(rowDiff) > Math.abs(colDiff)) {
            if (rowDiff < 0) {
                current.setRow(current.getRow() + 1);
            } else {
                current.setRow(current.getRow() - 1);
            }
        } else {
            if (colDiff < 0) {
                current.setCol(current.getCol() + 1);
            } else {
                current.setCol(current.getCol() - 1);
            }
        }
    }
}




