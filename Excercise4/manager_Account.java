package Excercise4;

import java.util.ArrayList;
import java.util.Scanner;

public class manager_Account {
    // ArrayList<Account> list_Accounts = new ArrayList<>();

    public void menu() {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account(123, "Nguyen The Sang");
        Account ac1 = new Account(456, "Nguyen Huu Tai");
        String reply;
        do {
            int key;
            System.out.println("input number menu ");
            key = Integer.parseInt(sc.nextLine());
            switch (key) {
                case 2:

                    ac.ruttien(50);
                    System.out.println(ac.toString());
                    break;
                case 3:

                    ac.naptien_Account(0);
                    System.out.println(ac.toString());

                    break;
                case 4:
                    ac.daohan();
                    break;
                case 5:
                    ac.chuyentien(123, 50);
                    ac1.nhantien(456, 50);
                    break;
            }

            System.out.println("Do you want to next <c/k>?");
            reply = sc.nextLine();
        } while (reply.equals("c"));
    }
}
