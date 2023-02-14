package edu.Cohenad.exercises03;
import java.util.*;
public class GeneralStore {

    public void printWelcome(){}
    public void printOptions()
    {
        System.out.println("** inventory **");
        System.out.println("* Food");
        System.out.println("What do you want to buy");
    }

    public void updateSupplies(Supplies s, String request)
    {
        if(request.trim().length() > 0) {
            Scanner tokens = new Scanner(request);
            int cnt = tokens.nextInt();
            String item = tokens.next();
        }
    }
    public void printGoodbye(){}
    public void visit(Scanner input,Supplies s)
    {
        //welcome
     printWelcome();
        //while there not done
        String userRequest = "";
        do {
            // list options
            printOptions();

            // ask user what to buy
            userRequest = input.nextLine();

            // add to supplies
            update

        }while(buyCnt != 0);





        //goodbye
        printGoodbye();
    }
    public static void main(String [] args)
    {
        GeneralStore store = new GeneralStore();
        Supplies s = new Supplies();
        Scanner input = new Scanner(System.in);
        store.visit(s);
    }
}
