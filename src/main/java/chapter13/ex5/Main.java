package chapter13.ex5;

import java.math.BigInteger;
import java.util.Formatter;

/**
 * Created by pyvov on 15.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        f.format("%d\n",new BigInteger("5000000000"));
        f.format("%c\n",'u');
        f.format("%b\n",null);
        f.format("%s\n",new Main());
        f.format("%f\n",1d);
        f.format("%e\n",1f);
        f.format("%x\n",1531);
        f.format("%h\n",-12.5);
    }
}
