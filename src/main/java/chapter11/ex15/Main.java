package chapter11.ex15;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        String str = "+U+n+c---+e+r+t---+a-+BinaryFile-+n+t+y---+ -+r+u--+l+e+s---";
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '+':
                    stack.push(str.charAt(++i));
                    break;
                case '-':
                    stack.pop();
                    break;
            }
            System.out.println("BinaryFile = " + i + ", stack = " + stack);
        }
    }
}
