package Excercise3;

import java.util.Scanner;

import javax.swing.plaf.TextUI;

public class Vehicle {
    private String fullname_of_vehicle;
    private String range_of_vehicle;
    private double price;
    private int xylanh;
    private double tax;

    public Vehicle() {
        this.fullname_of_vehicle = null;
        this.range_of_vehicle = null;
        this.tax = 0.0d;
        this.price = 0.0d;
        this.xylanh = 0;

    }

    public Vehicle(String fullname_of_vehicle, String range_of_vehicle, int xylanh, double price, double tax) {
        this.fullname_of_vehicle = fullname_of_vehicle;
        this.range_of_vehicle = range_of_vehicle;
        this.tax = tax;
        this.price = price;
        this.xylanh = xylanh;

    }

    public double getprice() {
        return this.price;
    }

    public int getxylanh() {
        return this.xylanh;
    }

    public String getfullname() {
        return this.fullname_of_vehicle;
    }

    public String getrangeofvehicle() {
        return this.range_of_vehicle;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public void setxylanh(int xylanh) {
        this.xylanh = xylanh;
    }

    public void setfullname(String fullname) {
        this.fullname_of_vehicle = fullname;
    }

    public void setrangeofvehicle(String rangeofvehicle) {
        this.range_of_vehicle = rangeofvehicle;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("fullname of vehicle: ");
        this.fullname_of_vehicle = sc.nextLine();
        System.out.println("range of vehicle");
        this.range_of_vehicle = sc.nextLine();
        System.out.println("input xylanh of vehicle: ");
        this.xylanh = Integer.parseInt(sc.nextLine());
        System.out.println("input price of vehicle: ");
        this.price = Double.parseDouble(sc.nextLine());

    }

    public double tax_bef_price() {
        double thue;
        if (this.xylanh < 100) {
            thue = getprice() * 0.01;
        } else if (this.xylanh >= 100 && this.xylanh < 200) {
            thue = getprice() * 0.03;
        } else {
            thue = getprice() * 0.05;
        }

        return thue;
    }

    public void bangkekhaitax() {
        System.out.printf("%20s %20s %15s %15s %15s", "full name of vehicle", "Range of vehicle ", "Xylanh", "Price",
                "Tax");

        System.out.printf("\n%20s %20s %15d %15.2f %15.2f", getfullname(), getrangeofvehicle(), getxylanh(), getprice(),
                tax_bef_price());
    }
}
