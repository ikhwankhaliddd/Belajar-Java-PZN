public class MethodReturnValue {
    public static void main(String[] args) {
        var result1 = sum(100,100);
        System.out.println(result1);

        System.out.println(sum(200,200));

        System.out.println(hitung(100, "+", 100));
        System.out.println(hitung(100, "-", 100));
        System.out.println(hitung(100, "salah", 100));
    }

    static int sum(int num1, int num2){
        var total = num1 + num2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+" :
                return value1 + value2;
            case "-" :
                return value1 - value2;
            default:
                return 0;
        }
    }
}
