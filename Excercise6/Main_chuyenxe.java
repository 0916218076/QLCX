package Excercise6;

import java.io.Console;
import java.util.function.Function;

import javax.swing.text.AbstractDocument.LeafElement;

import Excercise4.manager_Account;

public class Main_chuyenxe {
    public static void main(String[] args) {

        Manager_chuyenxe mn = new Manager_chuyenxe();
        mn.input();
        mn.output();
        mn.Tongdoanhthu();
        mn.thongke();
        mn.search("123dh");
    }
}
