package Excercise4;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

import javax.naming.NameParser;
import javax.naming.spi.DirObjectFactory;
import javax.swing.JPopupMenu.Separator;

import Excercise1.retangle;

public class Account {
    private long num_Account;
    private String name_Account;
    private double price_in_Account;

    public Account() {
        this.num_Account = 0;
        this.name_Account = null;
        this.price_in_Account = 0.0d;
    }

    public Account(long num_Account, String name_Account, double price_in_Account) {
        this.num_Account = num_Account;
        this.name_Account = name_Account;
        this.price_in_Account = price_in_Account;
    }

    public long getnum_Account() {
        return this.num_Account;
    }

    public String getname_Account() {
        return this.name_Account;
    }

    public double getprice_in_Account() {
        return this.price_in_Account;
    }

    public void setnum_Account(long num_Account) {
        this.num_Account = num_Account;
    }

    public void setname_Account(String name_Account) {
        this.name_Account = name_Account;

    }

    public void setprice_in_Account(double price_in_Account) {
        this.price_in_Account = price_in_Account;
    }

    @Override

    public String toString() {
        return "Account {" + "number Account: " + getnum_Account() + "name Account: " + getname_Account() +
                "price in Account: " + NumberFormat.getCurrencyInstance(Locale.US).format(getprice_in_Account()) + "}";
    }

    private double interest_rate = 0.035;

    public Account(long num_Account, String nam_Account) {
        this.num_Account = num_Account;
        this.name_Account = nam_Account;
        this.price_in_Account = 50;

    }

    /**
     * 
     */
    public void naptien_Account(double naptien) {
        Account ac = new Account(num_Account, name_Account);
        ac.check_nap(naptien);
        setprice_in_Account(getprice_in_Account() + naptien);
        System.out.println("tien nap  la: " + naptien);

    }

    public void ruttien(double tienrut) {
        Account ac = new Account(num_Account, name_Account);
        ac.check_rut(tienrut);
        setprice_in_Account(getprice_in_Account() - tienrut);
        System.out.println("tien rut la: " + tienrut);
    }

    public void daohan() {
        setprice_in_Account(getprice_in_Account() + (getprice_in_Account() * this.interest_rate));
        System.out.println(
                "dao han 7 thang la: " + NumberFormat.getCurrencyInstance(Locale.US).format(getprice_in_Account()));
    }

    public void check_nap(double naptien) {

        if (naptien > 0) {
            System.out.println("nap tien hop le: ");

        } else {
            System.out.println("nap tien khong hop le: ");
        }

    }

    public void check_rut(double tienrut) {
        if (tienrut > getprice_in_Account()) {
            System.out.println("rut tien khong hop le: ");
        } else {
            System.out.println("rut tien hop le: ");
        }
    }

    public boolean check_tk_ng_nhan(long num_Account) {
        if (getnum_Account() == num_Account) {
            return true;
        }
        return false;

    }

    public boolean check_tk_ng_chuyen(long num_Account) {
        if (getnum_Account() == num_Account) {
            return true;
        }
        return false;

    }

    public void check_chuyentien(double chuyentien) {
        if (chuyentien > getprice_in_Account()) {
            System.out.println("chuyen tien khong hop le: ");

        } else {
            System.out.println("chuyen tien hop le: ");
        }
    }

    public void chuyentien_Account(double chuyentien) {
        check_chuyentien(chuyentien);
        double money_in_Account = getprice_in_Account();
        double chuyen_tien = money_in_Account - chuyentien;

        System.out.println("tien chuyen La: " + chuyen_tien);

    }

    public void nhan_tien_in_Account(double chuyentien) {

        double money_in_Account = getprice_in_Account();
        double nhan_tien = money_in_Account + chuyentien;
        System.out.println("so tien nhan la: " + nhan_tien);
    }

    public void chuyentien(long num_Account, double chuyen_tien) {
        if (check_tk_ng_chuyen(num_Account)) {

            chuyentien_Account(chuyen_tien);
        }

    }

    public void nhantien(long num_Account1, double chuyen_tien) {
        if (check_tk_ng_nhan(num_Account1)) {

            nhan_tien_in_Account(chuyen_tien);
        }
    }
}