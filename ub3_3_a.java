import java.util.Scanner;
//задание 3.3 a

public class ub3_3_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну для создания списка c головы: ");
        int k = sc.nextInt();
        createHead(k);
        System.out.println("Введите длинну для создания списка c хвоста: ");
        k = sc.nextInt();
        createTail(k);
    }
    public static void createHead(int k) {
        ErsteClass head = null;
        for (int i = k; i >= 1; i--) {
            System.out.println("Введите значение " + i + " переменной в списке: ");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            head = new ErsteClass(data, head);
        }
        ErsteClass ref = head;
        String Str = new String();
        while (ref != null) {
            Str = Str + ref.value + " ";
            ref = ref.next;
        }
        toString(Str);
    }
    public static void createTail(int k) {
        System.out.println("Введите значение 1 переменной в списке: ");
        Scanner sc = new Scanner(System.in);
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
        String Str = new String();
        int arr[] = new int[k];
        int i = 0;
        while (ref != null) {
            Str = Str + ref.value + " ";
            arr[i] = ref.value;
            ref = ref.next;
            i++;
        }
        toString(Str);
        AddFirst(arr, k);
    }
    public static void toString(String Str) {
        System.out.println(Str);
    }
    public static void AddFirst(int arr[], int k) {
        ErsteClass head = new ErsteClass(arr[0], null);
        ErsteClass tail = head;
        for (int i = 1; i < arr.length; i++) {
            tail.next = new ErsteClass(arr[i], null);
            tail = tail.next;
        }
        ErsteClass ref = head;
        String Str = new String();
        while (ref != null) {
            Str = Str + ref.value + " ";
            ref = ref.next;
        }
        System.out.println("Введите новое начало: ");
        Scanner sc = new Scanner(System.in);
        int newHead = sc.nextInt();
        head = new ErsteClass(newHead, head);
        System.out.println("Односвязный список с добавленым началом:");
        int newArr[] = new int[++k];
        int x = 0;
        for (ref = head; ref != null; ref = ref.next) {
            System.out.print(+ref.value + " ");
            newArr[x] = ref.value;
            x++;
        }
        AddLast(newArr, k);
    }
    public static void AddLast(int arr[], int k) {
        System.out.println("");
        ErsteClass head = new ErsteClass(arr[0], null);
        ErsteClass tail = head;
        for (int i = 1; i < arr.length; i++) {
            tail.next = new ErsteClass(arr[i], null);
            tail = tail.next;
        }
        System.out.println("Введите новый конец: ");
        Scanner sc = new Scanner(System.in);
        int newTail = sc.nextInt();
        ErsteClass newtail = new ErsteClass(newTail, null);
        ErsteClass ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newtail;
        System.out.println("Односвязный список с добавленым концом:");
        int newArr[] = new int[++k];
        int x = 0;
        for (ref = head; ref != null; ref = ref.next) {
            System.out.print(+ref.value + " ");
            newArr[x] = ref.value;
            x++;
        }
        Insert(newArr, k);
    }
    public static void Insert(int arr[], int k) {
        ErsteClass head = new ErsteClass(arr[0], null);
        ErsteClass tail = head;
        for (int i = 1; i < arr.length; i++) {
            tail.next = new ErsteClass(arr[i], null);
            tail = tail.next;
        }
        int zamArr1[] = new int[++k];
        int x = 0;
        for (ErsteClass ref = head; ref != null; ref = ref.next) {
            zamArr1[x] = ref.value;
            x++;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Введение значение переменной");
        int data = sc.nextInt();
        System.out.println("Введение позицию переменной");
        int pos = sc.nextInt();
        ErsteClass newNode = new ErsteClass(data, null);
        ErsteClass ref = head;
        int j = 0;
        int[] zamArr2 = new int[zamArr1.length + 1];
            for (int i = 0; i < zamArr1.length; i++) {
                if(pos>zamArr1.length-1){
                    System.out.println("Такой позиции нет");
                    break;
                }else if (i < pos) {
                    zamArr2[i] = zamArr1[i];
                } else if (i == pos) {
                    zamArr2[i] = data;
                } else if (i > pos) {
                    zamArr2[i] = zamArr1[i - 1];
                }
                System.out.print(zamArr2[i] + " ");
            }
        RemoveFirst(zamArr2, k);
    }
    public static void RemoveFirst(int arr[], int k){
        System.out.println(" ");
        System.out.println("Удаляем первый элемент: ");
        ErsteClass head = new ErsteClass(arr[0], null);
        ErsteClass tail = head;
        for (int i = 1; i < arr.length-1; i++) {
            tail.next = new ErsteClass(arr[i], null);
            tail = tail.next;
        }
        head=head.next;
        int[] newArr = new int[--k];
        int x = 0;
        for (ErsteClass ref = head; ref != null; ref = ref.next) {
            System.out.print(+ref.value + " ");
            newArr[x] = ref.value;
            x++;
        }
        RemoveLast(newArr, newArr.length);
    }
    public static void RemoveLast(int[] arr, int k){
        System.out.println(" ");
        System.out.println("Удаляем последний элемент: ");
        ErsteClass head = new ErsteClass(arr[0], null);
        ErsteClass tail = head;
        for (int i = 1; i < arr.length; i++) {
            tail.next = new ErsteClass(arr[i], null);
            tail = tail.next;
        }
        ErsteClass ref = head;
        while(ref.next.next != null){
            ref=ref.next;
        }
        ref.next=null;
        ref = head;
        String Str = new String();
        while (ref != null) {
            Str = Str + ref.value + " ";
            ref = ref.next;
        }
        toString(Str);

        int[] newArr = new int[arr.length-1];
        for(int i = 0; i<k-1 ; i++){
            newArr[i] = arr[i];
        }
        Remove(newArr, newArr.length);
    }
    public static void Remove(int[] arr, int k){
        ErsteClass head = new ErsteClass(arr[0], null);
        ErsteClass tail = head;
        for (int i = 1; i < arr.length; i++) {
            tail.next = new ErsteClass(arr[i], null);
            tail = tail.next;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Удалите переменную на позиции");
        ErsteClass ref = head;
        int pos = sc.nextInt();
        int j = 1;
            while (ref.next != null && (j < pos)) {
                ref = ref.next;
                j++;
        }
        ref.next=ref.next.next;

        ref = head;
        String Str = new String();
        while (ref != null) {
            Str = Str + ref.value + " ";
            ref = ref.next;
        }
        toString(Str);
    }
}