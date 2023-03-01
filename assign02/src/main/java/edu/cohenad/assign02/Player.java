package edu.cohenad.assign02;


import java.util.Scanner;

public class Player {
    private String firstName = "";
    private String lastName = "";
    private int height = 0;
    private double weight = 0;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setFirstName(String first) {
        firstName = first;
    }

    public void setLastName(String last) {
        lastName = last;
    }

    public void setHeight(int totalInches) {
        height = totalInches;
    }

    public void setWeight(double pounds) {
        weight = pounds;
    }

    public int calculateBMI() {
        int bmi = (int) ((703 * weight) / (height * height));
        return bmi;
    }

    public String getNameString() {
        return lastName + ", " + firstName;
    }

    public String getHeightString() {
        int feet = height / 12;
        int inches = height % 12;
        return feet + "'-" + inches + "\"";
    }

    public String getWeightString() {
        return weight + " lbs.";
    }

    public String toString() {
        return "NAME: " + getNameString() + "\n"
                + "WEIGHT: " + getWeightString() + "\n"
                + "HEIGHT: " + getHeightString() + "\n"
                + "BMI: " + calculateBMI() + "\n";
    }
}

