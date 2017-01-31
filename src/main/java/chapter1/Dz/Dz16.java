package chapter1.Dz;

import java.util.Random;

/**
 * Created by pyvov on 13.10.2016.
 */
public class Dz16 {
    public static void main(String[] args) {
        for(int i=0;i<25;i++){
            Random random = new Random();
            int a = random.nextInt(10);
            int b = random.nextInt(10);
            char c;
            if(a>b)
                c= '>';
            else if(a<b)
                c='<';
            else
                c='=';
            System.out.println(a+" "+c+" "+b);
        }
    }
}
