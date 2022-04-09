public class Array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];

        String[] arrayString2 = new String[3]; // inisialisasi array
        arrayString[0] = "Ikhwan";
        arrayString[1] = "Khaleed";
        arrayString[2] = "Nasution";

//        System.out.println(arrayString[0]);

        int[] arrayInt = {
                1,2,3,4,5
        }; // Cara lain membuat array

        long[] arrayLong = {
                1L,2L,4L,5L
        };

        String[][] anggota = {
                {"Muhammad", "Ikhwan", "Khalid"},
                {"Alex", "Lianardo"},
                {"Muhammad","Reyhan","Fajar"}
        };

        String[] anggota1 = anggota[0];
        System.out.println(anggota1[1]);

        System.out.println(anggota[1][0]);
        System.out.println(anggota[2][1]);

        int panjangArrayLong = arrayLong.length;

        System.out.println(panjangArrayLong);




    }
}
