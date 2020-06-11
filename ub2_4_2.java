//"Это задание 2.4 методом деления отрезка вариант 2"

import java.math.BigDecimal;
import java.util.Scanner;
public class ub2_4_2 {
    public static double f(double x){return x * x * x + 3 * x * x - 6 * x - 8;}
    public static double prf ( double x){return 3 * x * x + 4 * x - 5;}
    public static double x_newton ( double a, double e){
        double x = a;
        double razn;
        do {
            double xn = x - f(x) / prf(x);
            razn = Math.abs(xn - x);
            x = xn;
        } while (razn > e);
        return x - f(x) / prf(x);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите начальные значения интервала и + погрешность");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double e = sc.nextDouble();
        System.out.print("Введите предполагаемое количество корней=> ");
        int kol = sc.nextInt();
        double xArray[] = new double[kol];
        int kol_naideno;
        double x, y1, y2;
        double h = (b - a) / kol;
        do {
            kol_naideno = 0;
            x = a;
            while (x < b) {
                y1 = f(x);
                y2 = f(x + h);
                if ((y1 * y2 <= 0)) {
                    x = x_newton(x, e);
                    xArray[kol_naideno] = x;
                    kol_naideno++;
                }
                x += h;
            }
            h /= 2;
        } while ((kol > kol_naideno) && (2 * h > e));
        System.out.println("Корни уравнения:");
        for (int i = 0; i < xArray.length; i++) {
            System.out.println(new BigDecimal(xArray[i]).setScale(3,BigDecimal.ROUND_UP));
        }
    }
}