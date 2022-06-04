public class ForEach {
    public static void main(String[] args) {
        System.out.println("==========FOR LOOP=============");

        // Mengakses array menggunakan for loop biasa
        String[] array = {
                "Muhammad", "Ikhwan", "Khaleed"
        };
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("==========FOR EACH=============");

        // Mengakses array menggunakan for each loop
        for(var name: array){
            System.out.println(name);
        }
    }
}
