package Excercise2;

import java.util.Scanner;

public class student {
    private int MSSV;
    private String fullname;
    private float score_of_LT;
    private float score_of_TH;

    public student() {
        this.MSSV = 0;
        this.fullname = null;
        this.score_of_LT = 0.0f;
        this.score_of_LT = 0.0f;
    }

    public student(int MSSV, String fullname, float score_of_LT, float score_of_TH) {
        this.MSSV = MSSV;
        this.fullname = fullname;
        this.score_of_LT = score_of_LT;
        this.score_of_TH = score_of_TH;
    }

    public int getMSSV() {
        return this.MSSV;
    }

    public String getfullname() {
        return this.fullname;
    }

    public float getscoresLT() {
        return this.score_of_LT;

    }

    public float getscoresTH() {
        return this.score_of_TH;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public void setfullname(String fullname) {
        this.fullname = fullname;
    }

    public void setscoreLT(float score_of_LT) {
        this.score_of_LT = score_of_LT;
    }

    public void setscoreTh(float score_of_TH) {
        this.score_of_TH = score_of_TH;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input MSSV: ");
        this.MSSV = Integer.parseInt(sc.nextLine());
        System.out.println("input fullname: ");
        this.fullname = sc.nextLine();

        System.out.println("input score LT: ");
        this.score_of_LT = Float.parseFloat(sc.nextLine());
        System.out.println("input score Th: ");
        this.score_of_TH = Float.parseFloat(sc.nextLine());
    }

    @Override
    public String toString() {
        return "{" + "MSSV: " + getMSSV() + "fullname: " + getfullname() + "score LT" + getscoresLT() + "score Th: "
                + getscoresTH() + "}";
    }

    public float AVG() {
        return ((this.score_of_LT + this.score_of_TH) / 2);
    }

}
