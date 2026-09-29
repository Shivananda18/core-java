package engg.parent;

public class CastRunner {
    public static void main(String[] args) {
//implicit casting ==> lower range  to higher range casting
        //narrowing casting
        byte i = 10;
        short i2 = i;
        System.out.println("byte " + i);
        System.out.println("byte to short " + i2);

        short i7 = 10;
        int i3 = i7;
        System.out.println("short " + i7);
        System.out.println("short to int " + i3);

        int i8 = 100;
        long i4 = i8;
        System.out.println("int  " + i8);
        System.out.println("int to long  " + i4);

        long i9 = 8970327195L;
        float i5 = i9;
        System.out.println("long  " + i9);
        System.out.println("long to float  " + i5);

        float i10 = 1.0f;
        double i6 = i10;
        System.out.println("float " + i10);
        System.out.println("float to double " + i6);

        //explicit casting ===> higher range to lower range casting

        char x = 'A';
        System.out.println("char " + x);
        System.out.println("char to double " + (double) x);

        double x5 = 100.00;
        float x6 = (float) x5;
        System.out.println("double " + x5);
        System.out.println("double to float casting  " + x6);

        float x2 = 10.0f;
        long x7 = (long) x2;
        System.out.println("float " + x2 + "  to long casting " + x7);

        long x8 = 7760291885L;
        int x9 = (int) x8;
        System.out.println("long " + x8 + " to int casting " + x9);

        int x10 = 100;
        short x11 = (short) x10;
        System.out.println("int " + x10 + " To short casting " + x11);

        short x12 = 50;
        byte x13 = (byte) x12;
        System.out.println("short " + x12 + " To byte casting " + x13);
    }
}
