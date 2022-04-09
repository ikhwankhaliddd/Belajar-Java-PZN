public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 10;
        Long iniLong = 100000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int iniInt = 100;

        Integer iniObject = iniInt; // mengkonversi dari tipe data primitif ke non primitif

        short iniShort = iniObject.shortValue(); // mengkonversi antara data non primitif ke tipe data yang non kompatibel (Integer ke short)
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

    }
}
