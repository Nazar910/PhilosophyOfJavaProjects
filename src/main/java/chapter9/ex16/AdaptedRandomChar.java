package chapter9.ex16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by pyvov on 08.01.2017.
 */
public class AdaptedRandomChar extends RandomChar implements Readable {
    private int count;

    public AdaptedRandomChar(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) throws IOException {
        if( count-- == 0 ) {
            return -1;
        }
        cb.append(nextChar()+" ");
        return 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomChar(10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
