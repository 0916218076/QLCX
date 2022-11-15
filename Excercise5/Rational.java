package Excercise5;

import java.beans.DesignMode;
import java.lang.ref.PhantomReference;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this.numerator = 0;
        this.numerator = 0;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getnumerator() {
        return this.numerator;
    }

    public int getdenomerator() {
        return this.denominator;
    }

    public void setnumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setdenomerator(int denominator) {
        this.denominator = denominator;
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }

        }
        return a;
    }

    public void reduce() {
        int i = timUSCLN(numerator, denominator);
        this.setnumerator(getnumerator() / i);
        this.setdenomerator(getdenomerator() / i);
    }

    public void addrational(Rational ps) {
        int ts = this.numerator * ps.denominator + this.denominator * ps.numerator;
        int ms = this.denominator * ps.denominator;
        Rational phasotong = new Rational(ts, ms);
        phasotong.reduce();
        System.out.println("tong 2 phan so" + "=" + phasotong.numerator + "/" + phasotong.denominator);
    }

    public void inverse() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    public void subtract(Rational ps) {
        int ts = this.numerator * ps.denominator - this.denominator * ps.numerator;
        int ms = this.denominator * ps.denominator;
        Rational hieuphanso = new Rational(ts, ms);
        hieuphanso.reduce();
        System.out.println("hieu 2 phan so =" + hieuphanso.numerator + "/" + hieuphanso.denominator);
    }

    public void multipply(Rational ps) {
        int ts = this.numerator * ps.numerator;
        int ms = this.denominator * ps.denominator;
        Rational tichphanso = new Rational(ts, ms);
        tichphanso.reduce();
        System.out.println("tich 2 phan so =" + tichphanso.numerator + "/" + tichphanso.denominator);
    }

    public void divide(Rational ps) {
        int ts = this.numerator * ps.denominator;
        int ms = this.denominator * ps.numerator;
        Rational thuongphanso = new Rational(ts, ms);
        thuongphanso.reduce();
        System.out.println("thuong 2 phan so = " + thuongphanso.numerator + "/" + thuongphanso.denominator);
    }

    public double giatrithuc() {
        return (double) numerator / denominator;
    }

    public boolean sosanh(Rational ps) {

        return giatrithuc() > ps.giatrithuc();
    }
}
