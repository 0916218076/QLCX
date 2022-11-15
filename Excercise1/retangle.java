package Excercise1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class retangle {
    private double length;
    private double width;

    public retangle() {
        this.length = 0.0d;
        this.width = 0.0d;
    }

    public retangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getlength() {
        return this.length;
    }

    public double getwidth() {
        return this.width;
    }

    public void setlength(double length) {
        this.length = length;
    }

    public void setwidth(double width) {
        this.width = width;
    }

    public double area() {
        return getlength() * getwidth();
    }

    public double perimeter() {
        return ((getlength() + getwidth()) * 2);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input length: ");
        this.length = Double.parseDouble(sc.nextLine());
        System.out.println("input width: ");
        this.width = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "retangle{" + "length: " + getlength() + "width: " + getwidth() + "area: " + area() + "perimeter: "
                + perimeter() + "}";
    }

}