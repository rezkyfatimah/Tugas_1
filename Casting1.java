/* Casting menggunakan tipe data primitif */
public class Casting1 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int a = 5, b = 6;
        float d = 2.0f, e = 3.2f;
        char g = '5';
        double k = 3.14;

        // Casting dan output
        System.out.println((float) a);   // int ke float → 5.0
        System.out.println((double) b);  // int ke double → 6.0
        System.out.println((int) d);     // float ke int → 2
        System.out.println((double) e);  // float ke double → 3.2
        System.out.println((int) g);     // char ke int (ASCII) → 53
        System.out.println((float) g);   // char ke float (ASCII) → 53.0
        System.out.println((double) g);  // char ke double (ASCII) → 53.0
        System.out.println((int) k);     // double ke int → 3
        System.out.println((float) k);   // double ke float → 3.14
    }
}
