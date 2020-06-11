//задание 3.2 с хвоста

public class ub3_2_2 {
    public static void main(String[] args) {
        ErsteClass head = null;
        for(int i = 9; i>=0 ;i--){
            head = new ErsteClass(i, head);
        }
         ErsteClass ref = head;
        while (ref != null){
            System.out.println(ref.value);
            ref=ref.next;
        }
    }
}
