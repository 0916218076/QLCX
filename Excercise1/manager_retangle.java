package Excercise1;

import java.util.Scanner;

public class manager_retangle {
    public void input() {
        Scanner sc = new Scanner(System.in);
        retangle rt = new retangle();
        String reply;
        do {
            System.out.println("choose retangle<1. input; 2. ouput>?");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    rt.input();
                    break;

                case 2:
                    System.out.println(rt.toString());

                    break;

            }

            System.out.println("You have input next again <c/k>?: ");
            reply = sc.nextLine();

        } while (reply.equals("c"));
    }
}
