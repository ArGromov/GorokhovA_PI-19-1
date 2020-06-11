//Это задание 2.1 "Создать приложения для демонстрации примера 2.4"

public class ub2_1_4 {
    public static int fact(int n){
        int result;
        if (n==1)
            return 1;
        else{
            result=fact(n-1)*n;
            return result;
        }
    }
}