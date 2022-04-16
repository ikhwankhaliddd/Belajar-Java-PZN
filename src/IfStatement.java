public class IfStatement {
    public static void main(String[] args) {
        var nilai = 90;
        var absen = 90;

        if(nilai >=80 && absen>= 75){
            System.out.println("Nilai anda A");
        }

        else if (nilai >= 70 && absen >= 75){
            System.out.println("Nilai anda B");
        }
        else if (nilai >= 60 && absen >= 75){
            System.out.println("Nilai anda C");
        }
        else if (nilai >= 50 && absen >= 75){
            System.out.println("Nilai anda D");
        }
        else {
            System.out.println("Nilai anda E");
        }
    }
}
