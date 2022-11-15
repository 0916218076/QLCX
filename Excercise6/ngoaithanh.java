package Excercise6;

import java.util.Scanner;

import Excercise1.retangle;

public class ngoaithanh extends chuyenxe {
    private String noiden;
    private int songaydi;

    public ngoaithanh() {
        super();
        this.noiden = null;
        this.songaydi = 0;
    }

    public ngoaithanh(String noiden, int songaydi) {
        super();
        this.noiden = noiden;
        this.songaydi = songaydi;
    }

    public String getnoiden() {
        return this.noiden;

    }

    public int getsongaydi() {
        return this.songaydi;
    }

    public void setnoiden(String noiden) {
        this.noiden = noiden;
    }

    public void setsongaydi(int songaydi) {
        this.songaydi = songaydi;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("input noi den: ");
        this.noiden = sc.nextLine();
        System.out.println("input so ngay di: ");
        this.songaydi = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "{" + super.toString() + "noi den la: " + getnoiden() + "so ngay di: " + getsongaydi() + "}";
    }
}
