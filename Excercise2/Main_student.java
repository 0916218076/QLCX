package Excercise2;

public class Main_student {
    public static void main(String[] args) {
        student sv1 = new student(123, "Nguyen Huu Tai", (float) 8.9, (float) 9.9);
        student sv2 = new student(456, "Nguyen The Sang", (float) 7.7, (float) 8.8);
        student sv3 = new student();
        sv3.input();
        System.out.printf("%20s %15s %15s %15s", "MSSV", "score LT: ", "score TH: ", "AVG: ");
        System.out.printf("\n%20d %15.2f %15.2f %15.2f \n", sv1.getMSSV(), sv1.getscoresLT(),
                sv1.getscoresTH(), sv1.AVG());
        System.out.printf("%20d  %15.2f %15.2f %15.2f \n", sv2.getMSSV(), sv2.getscoresLT(),
                sv2.getscoresTH(), sv2.AVG());
        System.out.printf("%20d  %15.2f %15.2f %15.2f \n", sv3.getMSSV(), sv3.getscoresLT(),
                sv3.getscoresTH(), sv3.AVG());
    }
}
