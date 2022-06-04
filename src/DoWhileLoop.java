public class DoWhileLoop {
    public static void main(String[] args) {
        // Do While Loop mirip dengan While Loop hanya saja kondisi di cek di akhir bukan diawal
        // do {
        // TULIS CODE DISINI;
        // } while(condition);
        var counter = 100;
        do {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        } while(counter<=10);
    } // pada Do While minimal akan menjalankan perulangan 1 kali walaupun kondisinya false
}
