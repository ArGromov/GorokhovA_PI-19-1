//задание 3.2 с головы

public class ub3_2_1 {
    public static void main(String[] args) {
        ErsteClass head = new ErsteClass(0,null);
        ErsteClass tail = head;
        for(int i = 0; i<9;i++){
            tail.next=new ErsteClass(i+1,null);
            tail = tail.next;
        }
        ErsteClass ref = head;
        while (ref != null){
            System.out.println(ref.value);
            ref=ref.next;
        }
    }
}

