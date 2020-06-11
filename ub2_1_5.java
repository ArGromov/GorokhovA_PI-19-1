//Это задание 2.1 "Создать приложения для демонстрации примера 2.5
// Для примера 2.5 дополнительно вывести последовательность обхода дерева рекурсивных вызовов."

public class ub2_1_5 {
    public static int f(int n){
        if (n==0){
            return 0;
        }else
            if(n == 1){
            return 1;
        }else{
            return f(n-2) + f(n-1);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println("n = " + f(i));
        }
    }
}