//Это задание 2.1 "Создать приложения для демонстрации примера 2.1"

public class ub2_1_1 {
        public static void m(int x){
            System.out.println("x=" + x);
            if ((2*x+1)< 20){
                m(2*x + 1);
            }
        }

    public static void main(String[] args) {
            m(1);
    }
}
