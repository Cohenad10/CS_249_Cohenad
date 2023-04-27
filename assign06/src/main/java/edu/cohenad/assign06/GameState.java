package edu.cohenad.assign06;
import edu.cohenad.assign04.CharBoard;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class GameState implements Loadable {

    private CharBoard baseMap;
    private ArrayList<Loadable> loadables;

    public GameState() {
        baseMap = new CharBoard(12, 30, '.');
        loadables = new ArrayList<>();
    }

    public Loadable createLoadable(String typeName) throws GameFileException {
        switch(typeName) {
            case "Rat":
                return new Rat();
            case "Skeleton":
                return new Skeleton();
            case "Item":
                return new Item();
            case "Book":
                return new Book();
            default:
                throw new GameFileException("Unknown type: " + typeName);
        }
    }

    public void load(Scanner input) throws GameFileException {
        baseMap.clear();
        loadables.clear();

        int numLines = input.nextInt();
        input.nextLine(); // consume newline after int

        for (int i = 0; i < numLines; i++) {
            String typeName = input.next();
            Loadable m = createLoadable(typeName);
            m.load(input);
            loadables.add(m);
            if (m instanceof Drawable) {
                ((Drawable)m).draw(baseMap);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("MAP:\n");
        sb.append(baseMap.getMapString() + "\n");

        sb.append("CREATURES:\n");
        for (Loadable l : loadables) {
            if (l instanceof Creature) {
                sb.append("* " + l + "\n");
            }
        }

        sb.append("INVENTORY:\n");
        for (Loadable l : loadables) {
            if (l instanceof Item) {
                sb.append("* " + l + "\n");
            }
        }

        return sb.toString();
    }

    public void save(String filename) throws GameFileException {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.print(this.toString());
        } catch (Exception e) {
            throw new GameFileException("Failed to save file!", e);
        }
    }
}
