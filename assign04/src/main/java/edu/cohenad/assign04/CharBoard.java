package edu.cohenad.assign04;

public class CharBoard {
    private int rowCnt;
    private int colCnt;
    private char fillChar;
    private char[][] board;

    public CharBoard(int rowCnt, int colCnt, char fillChar) {
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        this.fillChar = fillChar;
        this.board = new char[rowCnt][colCnt];

        for (int row = 0; row < rowCnt; row++) {
            for (int col = 0; col < colCnt; col++) {
                board[row][col] = fillChar;
            }
        }
    }

    public void clear() {
        for (int row = 0; row < rowCnt; row++) {
            for (int col = 0; col < colCnt; col++) {
                board[row][col] = fillChar;
            }
        }
    }

    public int getRowCnt() {
        return rowCnt;
    }

    public int getColCnt() {
        return colCnt;
    }

    public boolean isValidPosition(int row, int col) {
        return row >= 0 && row < rowCnt && col >= 0 && col < colCnt;
    }

    public char getPos(int row, int col) {
        if (isValidPosition(row, col)) {
            return board[row][col];
        } else {
            return ' ';
        }
    }

    public boolean setPos(int row, int col, char c) {
        if (isValidPosition(row, col)) {
            board[row][col] = c;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return rowCnt + " x " + colCnt + " edu.cohenad.assign04.CharBoard (default: " + fillChar + ")";
    }
// was failing 1 test when i didnt have edu.cohenad.assign04 and said that was the only error so i added it
    public String getMapString() {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < rowCnt; row++) {
            for (int col = 0; col < colCnt; col++) {
                sb.append(board[row][col]);
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}


