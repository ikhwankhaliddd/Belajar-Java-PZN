public class Variabel {

    public static void main(String[] args) {
        String name;
        name = "Ikhwan Khaleed Nasution";
        System.out.println(name);

        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Muhammad Ikhwan Khaleed"; // Mengganti value dari variabel name
        System.out.println(name);

        var firstName = "Muhammad Ikhwan Khalid";
        var lastName = "Nasution";

        var fullName = firstName + " " + lastName;

        System.out.println(fullName);
        final String application = "Belajar Java";

        //application = "Belajar Python"; // akan error karena final akan membuat value dari variable application menjadi konstan

    }
}
