import java.util.Scanner;
//задание 3.3 b

public class ub3_3_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну для создания списка c головы: ");
        int k = sc.nextInt();
        ErsteClass head = null;
        String Str = new String();
        createHeadRec(k, head, Str);

        System.out.println("Введите длинну для создания списка c головы: ");
        k = sc.nextInt();
        Str = new String();
        System.out.println("Введите значение переменной 1");
        int data = sc.nextInt();
        head = new ErsteClass(data,null);
        ErsteClass tail = head;
        createTailRec(k,1, head, tail, head.value + "", 2);
    }
    public static void createHeadRec(int k, ErsteClass head, String str) {
        if (k > 0) {
            System.out.println("Введите значение переменной " + k);
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            head = new ErsteClass(data, head);
            createHeadRec(k-1, head, str = str + " " + head.value);
        }else{
            toStringRec(str);
        }
    }
    public static void createTailRec(int k, int i, ErsteClass head, ErsteClass tail, String str, int j){
        if(i < k){
            System.out.println("Введите значение переменной " + j);
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            tail.next=new ErsteClass(data,null);
            createTailRec(k, i+1, head, tail.next, str = str + " " + tail.next.value, j+1);
        }else{
            toStringRec(str);
        }
    }
    public static void toStringRec(String str){
        System.out.println(str);
    }
}
