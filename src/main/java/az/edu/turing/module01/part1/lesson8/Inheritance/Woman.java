package az.edu.turing.module01.part1.lesson8.Inheritance;

import az.edu.turing.module01.part1.lesson8.Inheritance.Human;
import az.edu.turing.module01.part1.lesson8.Inheritance.SportsHuman;

public class Woman extends Human implements SportsHuman {
    private double estrogenLevel;

    public Woman(String name, int age, double height, double estrogenLevel) {
        super(name, age, height);
        this.estrogenLevel = estrogenLevel;
    }

    public double getEstrogenLevel() {
        return estrogenLevel;
    }

    public void setEstrogenLevel(double estrogenLevel) {
        this.estrogenLevel = estrogenLevel;
    }

    @Override
    public void workout() {
        System.out.println("Woman is doing workout....");
    }
}
