package chapter1.Operators;

/**
 * Created by pyvov on 13.10.2016.
 */
public class AllOps {
    void f(boolean b){}
    void boolTest(boolean x, boolean y){
        //! x = x * y;
        //! x = x / y;
        //! x = x % y;
        //! x = x + y;
        //! x = x - y;
        //! x = x++;
        //! x = x--;
        //! x = +x;
        //! x = -y;

        //! f(x > y);
        //! f(x >= y);
        //! f(x < y);
        //! f(x <= y);
        f(x == y);
        f(x != y);
        f(!y);
        x = x && y;
        x = x || y;

        //! x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        //! x = x << 1;
        //! x = x >> 1;
        //! x = x >>> 1;

        //! x += y;
        //! x -= y;
        //! x *= y;
        //! x /= y;
        //! x %= y;
        //! x <<= y;
        //! x >>= y;
        //! x >>>= y;
        x &= y;
        x ^= y;
        x |= y;

        //! char c = (char) x;
        //! byte b = (byte) x;
        //! short s = (short) x;
        //! int BinaryFile = (int) x;
        //! long l = (long) x;
        //! float f = (float) x;
        //! double d = (double) x;
    }
    void charTest(char x, char y){
        x = (char)(x * y);
        x = (char)(x / y);
        x = (char)(x % y);
        x = (char)(x + y);
        x = (char)(x - y);
        x++;
        x--;
        x = (char)+y;
        x = (char)-y;

        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //! f(!x);
        //! f(x && y);
        //! f(x || y);

        x =(char)~y;
        x =(char) (x & y);
        x =(char)( x | y);
        x =(char)(x ^ y);
        x =(char) (x << 1);
        x =(char)(x >> 1);
        x =(char) (x >>> 1);

        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= y;
        x >>= y;
        x >>>= y;
        x &= y;
        x ^= y;
        x |= y;

        //! boolean b = (boolean)x;
        char c = (char) x;
        byte b = (byte) x;
        short s = (short) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
    }
    void byteTest(byte x, byte y){
        x = (byte)(x * y);
        x = (byte)(x / y);
        x = (byte)(x % y);
        x = (byte)(x + y);
        x = (byte)(x - y);
        x++;
        x--;
        x = (byte)+y;
        x = (byte)-y;

        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //! f(!x);
        //! f(x && y);
        //! f(x || y);

        x =(byte)~y;
        x =(byte) (x & y);
        x =(byte)( x | y);
        x =(byte)(x ^ y);
        x =(byte) (x << 1);
        x =(byte)(x >> 1);
        x =(byte) (x >>> 1);

        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= y;
        x >>= y;
        x >>>= y;
        x &= y;
        x ^= y;
        x |= y;

        //! boolean b = (boolean)x;
        char c = (char) x;
        short s = (short) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
    }
    void shortTest(short x, short y){
        x = (short)(x * y);
        x = (short)(x / y);
        x = (short)(x % y);
        x = (short)(x + y);
        x = (short)(x - y);
        x++;
        x--;
        x = (short)+y;
        x = (short)-y;

        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //! f(!x);
        //! f(x && y);
        //! f(x || y);

        x =(short)~y;
        x =(short) (x & y);
        x =(short)( x | y);
        x =(short)(x ^ y);
        x =(short) (x << 1);
        x =(short)(x >> 1);
        x =(short) (x >>> 1);

        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= y;
        x >>= y;
        x >>>= y;
        x &= y;
        x ^= y;
        x |= y;

        //! boolean b = (boolean)x;
        char c = (char) x;
        byte b = (byte) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
    }
}
