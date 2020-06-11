import java.util.Scanner;
//задание 3.4 вариант 2

public class ub3_4 {
    public static void main(String args[]){
        System.out.println("Задание А");
        System.out.println("Введите длинну: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Введите значение 1 переменной в списке: ");
        int data = sc.nextInt();
        ErsteClass head = new ErsteClass(data, null);
        ErsteClass tail = head;
        for (int i = 2; i < k + 1; i++) {
            System.out.println("Введите значение " + i + " переменной в списке: ");
            data = sc.nextInt();
            tail.next = new ErsteClass(data, null);
            tail = tail.next;
        }
        ErsteClass ref = head;
        while (ref!= null){
            System.out.println(ref.value + " ");
            ref = ref.next;
        }
        ref = head;
        int sum = 0;
        int kol = 0;
        int sr = 0;
        while (ref!= null) {
            if(ref.value != 5){
                sum = sum + ref.value;
                kol++;
            }
            ref = ref.next;
        }
        if(kol != 0){
            sr = sum/kol;
            System.out.println("Сумма: "+sum);
            System.out.println("Кол-во: "+kol);
            System.out.println("Среднее ариф: "+sr);
        }else{
            System.out.println("Нет чисел которые не делятся на 5");
        }
        System.out.println("Задание Б");
        ref = head;
        int min = head.value;
        int max = 0;
        int i = 0;
        int imin=1;
        while (ref!= null) {
            if(ref.value<min){
                min = ref.value;
                imin = i+1;
            }
            i++;
            ref = ref.next;
        }
        i=0;
        int imax=0;
        ref = head;
        while (ref != null) {
            if(ref.value>max){
                max = ref.value;
                imax = i+1;
            }
            i++;
            ref = ref.next;
        }
        System.out.println(min+" - min с позицией - " + imin);
        System.out.println(max+" - max с позицией - " + imax);
    }
}
