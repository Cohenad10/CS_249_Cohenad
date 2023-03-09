package edu.Cohenad.exercises03;
import java.util.*;

public class FoodRationer {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Supplies supplies = new Supplies();
        System.out.println("Welcome to the trail!");

        System.out.println("Enter total food:");
        supplies.addFood(input.nextDouble());
        System.out.println("Enter number of people:");
        int partyCnt = input.nextInt();
        double rations = 10;

        double daysLeft = supplies.getTotalFood()/(partyCnt*rations);
        System.out.println("DAYS LEFT: " + daysLeft);
/*
        double y = 2.0;
        int x = 10;
        x = (int)(x/y);

        String t = null;

        if(t != null) {
            System.out.println(t);
            System.out.println(t.length());
        }

        String s = "";
        System.out.println(s);
        System.out.println(s.length());

        char c = s.charAt(0);
*/
        Random r1 = new Random( 42);
        Random r2 = new Random( 42);
        System.out.println("RANDOM:");
        for(int i = 0; i < 5; i ++)
        {
            System.out.println(r1.nextDouble());
            System.out.println(r2.nextDouble());
        }
        boolean foundTreasure = true;
        if(foundTreasure)
        {
            System.out.println("Huzzah");
        }

    }
}