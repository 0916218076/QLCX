package Excercise3;

public class main_vehicle {
    public static void main(String[] args) {
        Vehicle vh = new Vehicle("Nguyen Huu Tai", "Future Neo", 100, 3500000, 0.03);
        manager_Vehicle mn = new manager_Vehicle();
        mn.menu();

    }

}
