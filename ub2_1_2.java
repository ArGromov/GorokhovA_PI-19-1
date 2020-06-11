//Это задание 2.1 "Создать приложения для демонстрации примера 2.2"

public class ub2_1_2 {
    public static void m(int x) {
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
        System.out.println("x=" + x);
    }

    public static void main(String[] args) {
        m(1);
    }
}
