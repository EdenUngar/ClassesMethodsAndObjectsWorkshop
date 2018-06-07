package com.company;

public class Snake extends Pet {

    String scaleColor;
    double weight;
    double length;
    double species;
    boolean venomous;

    public Snake(String ownerName, String petName, int age, char gender, String homeAddress, double weight, double length) {
        super(ownerName, petName, age, gender, homeAddress);
        this.weight = weight;
        this.length = length;
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSpecies() {
        return species;
    }

    public void setSpecies(double species) {
        this.species = species;
    }

    public boolean isVenomous() {
        return venomous;
    }

    public void setVenomous(boolean venomous) {
        this.venomous = venomous;
    }
}
