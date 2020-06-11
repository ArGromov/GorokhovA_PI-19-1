//"Это задание 2.4 методом Ньютона вариант 2"

import java.lang.Math;

public class ub2_4_1 {
    public static double f(double x) {
            return Math.pow(x,3)+3*Math.pow(x,2)-6*x-8;
        }
    public static void main(String[] args) {
        rec(-4, -1, 2, 1, 0.0001 );

    }
    public static void rec(double a, double b, double c, int k, double EPS){
        if((b-a)>EPS){
                    c = (a+b)/2;
                    if((f(c)*f(a)<0) && (f(c)!=0)){
                        System.out.println(k + " итерация");
                        System.out.println(" x* = "+(b+a)/2);
                        System.out.println(" f(x) ="+f(c));
                        b=c;
                        rec(a,c,c,k+1,EPS);
                    }else if(f(c)!=0){
                        System.out.println(k + " итерация");
                        System.out.println(" x* = "+(b+a)/2);
                        System.out.println(" f(x) ="+f(c));
                        a=c;
                        rec(c,b,c,k+1,EPS);
                    }else if(f(c)==0){
                        System.out.println(" x* = "+(b+a)/2);
                        System.out.println(" f(x) ="+f(c));
                        System.out.println(k + " итерация");
                    }
                }
    }
}