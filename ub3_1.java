//задание 3.1

class ErsteClass {
    public int value;
    public ErsteClass next;

    ErsteClass(int value, ErsteClass next) {
        this.value = value;
        this.next = next;
    }
}
    public class ub3_1 {
        public static void main(String[] args) {
            ErsteClass node0= new ErsteClass(0, null);
            ErsteClass node1= new ErsteClass(1, null);
            ErsteClass node2= new ErsteClass(2, null);
            ErsteClass node3= new ErsteClass(3, null);

            node0.next = node1;
            node1.next = node2;
            node2.next = node3;

            ErsteClass ref = node0;
            while (ref!=null){
                System.out.println(ref.value);
                ref = ref.next;
            }
        }

}