package Excercise6;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;
import javax.xml.transform.Source;

import Excercise2.student;

public class Manager_chuyenxe {
    ArrayList<chuyenxe> listxe = new ArrayList<>();

    public void input() {
        Scanner sc = new Scanner(System.in);
        String reply;
        do {
            int key;
            System.out.println("-------menu----------");
            System.out.println("1. noithanh \n 2. ngoai thanh");
            System.out.println("input number: ");
            key = Integer.parseInt(sc.nextLine());
            switch (key) {
                case 1:
                    noithanh noi = new noithanh(123, "Nguyen Huu Tai", "123dh", 1000, 3, 100);
                    // noi.input();
                    listxe.add(noi);
                    break;

                case 2:
                    ngoaithanh nt = new ngoaithanh();
                    nt.input();
                    listxe.add(nt);
                    break;

                // case 3:
                // search(123);
                // break;

            }

            System.out.println("Do you want to input next<c/k> ?");
            reply = sc.nextLine();
        } while (reply.equals("c"));
    }

    public void output() {

        for (chuyenxe xe : listxe) {
            System.out.println(xe.toString() + xe.getClass());

        }
    }

    public void Tongdoanhthu() {
        double noi = 0, ngoai = 0;
        for (chuyenxe xe : listxe) {
            if (xe.getClass().getSimpleName().equals("noithanh")) {
                noi += xe.getdoanhthu();
            } else {
                ngoai += xe.getdoanhthu();
            }
        }

        System.out.println("doanh thu all cua noi thanh: " + noi);
        System.out.println("doanh thu all cua ngoai thanh: " + ngoai);

    }

    public void thongke() {
        int noi = 0;
        int ngoai = 0;
        for (chuyenxe xe : listxe) {
            if (xe.getClass().getSimpleName().equals("noithanh")) {
                noi++;
            } else {
                ngoai++;
            }
        }
        System.out.println("noi la: " + noi);
        System.out.println("ngoai la: " + ngoai);
    }

    public void search(String soxe) {
        for (chuyenxe xe : listxe) {
            if (xe.getsoxe().equals(soxe)) {
                System.out.println("tim thay");
                System.out.println(xe.getfullname_taixe() +" "+ xe.getMSCX());
            } else {
                System.out.println("ko tim thay");
            }
        }
    }

}
