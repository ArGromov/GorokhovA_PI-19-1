//"Это задание 2.3"

import java.util.Scanner;

public class ub2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int i = sc.nextInt();
        vvod(0, new int[i], 0);
    }
    public static void vvod(int x, int[] arr, int i) {
        if(x < arr.length){
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            arr[x] = k;
            vvod(x+1, arr, 0);
        }else if ((x == arr.length)&& (i<arr.length)){
            System.out.print("["+arr[i]+"] ");
            vvod(x,arr,i+1);
        }
    }
}


