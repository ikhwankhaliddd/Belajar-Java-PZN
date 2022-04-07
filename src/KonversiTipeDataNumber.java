public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        // Wide Casting (Konversi secara otomatis)

        byte iniByte = 100;
        short iniShort = iniByte; // Dari byte di convert ke short
        int iniInteger = iniShort; // Dari short di convert ke integer
        long iniLong = iniInteger; // Dari integer di convert ke long

        // Narrow Casting (Konversi secara manual)
        int iniInteger2 = 1000;
        byte iniByte2 = (byte) iniInteger2; // Dari integer di convert "paksa" ke byte
        // Hati hati karena dengan Narrow Casting sangat besar kemungkinan terjadi Number Overflow

        System.out.println(iniLong);
    }
}
