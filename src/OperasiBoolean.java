public class OperasiBoolean {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        var nilaiAkhir = 80;
        var absen = 80;

        var lulusAbsen = absen>= 75;
        var lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);

        System.out.println(a&&b); // AND operator
        System.out.println(a||b); // OR operator
    }
}
