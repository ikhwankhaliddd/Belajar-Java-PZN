public class ForLoop {
    public static void main(String[] args) {

        // for(init_statement; condition; post_statement){
        //  TULIS CODE DISINI
        // }


        // Block code dibawah akan infinite loop karena kondisi selalu true
//        for(;;){
//            System.out.println("Ini Infinite loop"); // deadlock
//        }
        // Block code dibawah menggunakan kondisi
        var counter  = 1;
        for(; counter <=10 ;){
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }

        // Block code dibawah ini menggunakan init statement dan kondisi
        for(int i = 1; i <= 6;){
            System.out.println("ini i ke-" + i);
            i++;
        }

        // Block code dibawah ini menggunakan init statement,kondisi,dan post statement
        for(int a = 1; a <= 5; a++){
            System.out.println("Ini adalah a ke-" + a);
        }
    }
}
