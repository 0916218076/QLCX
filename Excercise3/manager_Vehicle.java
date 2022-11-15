package Excercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class manager_Vehicle {
    ArrayList<Vehicle> listvehicle = new ArrayList<>();
    Vehicle vh = new Vehicle("Nguyen Huu Tai", "Future Neo", 100, 3500000, 0.03);
    Vehicle vh1 = new Vehicle();

    public void menu() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n------------Menu-------------");

            System.out.println(" 1. Input \n 2.output \n 3. Exit \n");
            System.out.println("Do you choose number menu 1->3");
            int key = Integer.parseInt(sc.nextLine());
            switch (key) {
                case 1:

                  
                    vh1.input();
                    listvehicle.add(vh1);

                    break;

                case 2:
                    for (Vehicle xe : listvehicle) {
                        xe.bangkekhaitax();
                    }

                    break;

                case 3:
                    System.exit(0);
                    break;

            }
        }

    }

}
