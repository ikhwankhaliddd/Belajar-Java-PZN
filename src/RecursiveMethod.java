public class RecursiveMethod {
    public static void main(String[] args) {
        // Recursive Method adalah kemampuan method dalam memanggil namanya sendiri
        System.out.println(Factorial(10));
        System.out.println(FactorialRecursive(10));
        loop(10000);
    }

    static int Factorial(int num){
        var result = 1;
        for(int counter = 1; counter <= num; counter++){
            result *= counter; // result = result * i
        }
        return result;
    }

    static int FactorialRecursive(int value){
        if(value == 1) {
            return 1;
        }
        else {
            return value * FactorialRecursive(value - 1);
        }
    }

    static void loop(int value){
        if(value == 0) {
            System.out.println("Loop Selesai");
        }

        else{
            System.out.println("Loop Ke-" + value);
            loop(value-1);
        }
    }

}
