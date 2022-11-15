package Excercise5;

import Excercise3.main_vehicle;

public class Main_rational {
    public static void main(String[] args) {
        Rational ps = new Rational(2, 2);
        Rational ps1 = new Rational(1, 1000);
        ps.inverse();
        ps.addrational(ps1);
        ps.subtract(ps1);
        ps.multipply(ps1);
        ps.divide(ps1);
        System.out.println("so sanh ps vs ps1: " + ps.sosanh(ps1));
    }

}
