public class Main {
    public static void main(String[] args) {
        Over inst1 = new Over();
        System.out.println(String.valueOf(inst1.x * inst1.y * inst1.z));
        Over inst2 = new Over(5);
        System.out.println(String.valueOf(inst2.x * inst2.y * inst2.z));
        Over inst3 = new Over(5, 6, 7);
        System.out.println(String.valueOf(inst3.x * inst3.y * inst3.z));
    }
}