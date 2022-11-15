package Excercise6;

import java.util.Scanner;

public class noithanh extends chuyenxe {
    private int sotuyen;
    private double sokmdiduoc;

    public noithanh() {
        super();
        this.sotuyen = 0;
        this.sokmdiduoc = 0.0d;
    }

    public noithanh(long MSCX, String fullname_taixe, String soxe, double doanhthu, int sotuyen, double sokmdiduoc) {
        super(MSCX, fullname_taixe, soxe, doanhthu);
        this.sotuyen = sotuyen;
        this.sokmdiduoc = sokmdiduoc;

    }

    public int getsotuyen() {
        return this.sotuyen;
    }

    public double getsokmdiduoc() {
        return this.sokmdiduoc;
    }

    public void setsotuyen(int sotuyen) {
        this.sotuyen = this.sotuyen;
    }

    public void setsokmdiduoc(double sokmdiduoc) {
        this.sokmdiduoc = sokmdiduoc;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("input so tuyen: ");
        this.sotuyen = Integer.parseInt(sc.nextLine());
        System.out.println("input so km di duoc: ");
        this.sokmdiduoc = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "noi thanh{" + super.toString() + "so tuyen la: " + getsotuyen() + "so km di duoc: " + getsokmdiduoc()
                + "}";
    }
}
