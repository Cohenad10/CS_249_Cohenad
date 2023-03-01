package edu.cohenad.assign02;

import java.util.Scanner;

public class CharacterCreation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Player p = new Player();

        System.out.println("Enter name:");
        String firstName = input.next();
        String lastName = input.next();

        System.out.println("Enter height in inches:");
        int height = input.nextInt();

        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();

        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setHeight(height);
        p.setWeight(weight);

        System.out.println(p.toString());


    }
}
