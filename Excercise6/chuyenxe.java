package Excercise6;

import java.net.Authenticator.RequestorType;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class chuyenxe {
    private long MSCX;
    private String fullname_taixe;
    private String soxe;
    private double doangthu;

    public chuyenxe() {
        this.MSCX = 0;
        this.fullname_taixe = null;
        this.soxe = null;
        this.doangthu = 0.0d;
    }

    public chuyenxe(long MSCX, String fullname_taixe, String soxe, double doanhthu) {
        this.MSCX = MSCX;
        this.fullname_taixe = fullname_taixe;
        this.soxe = soxe;
        this.doangthu = doanhthu;
    }

    public long getMSCX() {
        return this.MSCX;
    }

    public String getfullname_taixe() {
        return this.fullname_taixe;
    }

    public String getsoxe() {
        return this.soxe;
    }

    public double getdoanhthu() {
        return this.doangthu;
    }

    public void setMSCX(long MSCX) {
        this.MSCX = MSCX;
    }

    public void setfullname_taixe(String fullname_taixe) {
        this.fullname_taixe = fullname_taixe;
    }

    public void setsoxe(String soxe) {
        this.soxe = soxe;
    }

    public void setdoanhthu(double doanhthu) {
        this.doangthu = doanhthu;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ride number: ");
        this.MSCX = Long.parseLong(sc.nextLine());
        System.out.println("fullname tai xe: ");
        this.fullname_taixe = sc.nextLine();
        System.out.println("so xe: ");
        this.soxe = sc.nextLine();
        System.out.println("input doanh thu: ");
        this.doangthu = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "{" + "ma so xe la: " + getMSCX() + "ten tai xe la: " + getfullname_taixe() + "so xe la: " + getsoxe()
                + "doanh thu la: " + NumberFormat.getCurrencyInstance(Locale.US).format(getdoanhthu()) + "}";
    }

}
