public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assigment
        System.out.println("\n");

        int c = 100;
        System.out.println(c += 10);
        System.out.println(c -= 10);
        System.out.println(c *= 10);
        System.out.println(c /= 10);
        System.out.println(c %= 10);

        // Unary Operator
        System.out.println("\n");

        int d = 1;
        System.out.println(++d);
        System.out.println(--d);
        System.out.println(-d);
        System.out.println(+d);
        System.out.println(!true);
    }
}
