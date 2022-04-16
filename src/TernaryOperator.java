public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 90;
        String ucapan;

        if (nilai >= 75){
            ucapan = "Selamat anda lulus";
        }
        else{
            ucapan = "Anda tidak lulus";
        }
        System.out.println(ucapan);

        String ucapan2 = nilai>=75 ? "Selamat anda lulus" : "Silahkan coba lagi"; // mengunaakan ternary operator
        System.out.println(ucapan2);
    }
}
