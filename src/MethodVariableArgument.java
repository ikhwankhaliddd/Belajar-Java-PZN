public class MethodVariableArgument {
    public static void main(String[] args) {

        // Dengan array
        int[] nilai = {60,65,70,75,80,85};
        sayCongrats("Ikhwan", nilai);


        //Dengan method variable argument
        sayCongrats("Khaleed", 70,80,85,90,95);

    }
    static void sayCongrats(String name, int... values){
        var total = 0;
        for(var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + " Anda Lulus");
        }
        else {
            System.out.println("Maaf " + name + " Anda Tidak Lulus");
        }
    }
}
