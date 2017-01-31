package chapter14.ex25;

import java.lang.reflect.Method;

/**
 * Created by pyvov on 30.01.2017.
 */
public class Protected {
    public void p() {
        System.out.println("public p()");
    }
    void f() {
        System.out.println("package f()");
    }
    protected void g() {
        System.out.println("protected g()");
    }
    private void h() {
        System.out.println("private h()");
    }
}

class Test {
    public static void main(String[] args) throws Exception{
        Protected p = new Protected();
        callHiddenMethod(p, "p");
        callHiddenMethod(p, "f");
        callHiddenMethod(p, "g");
        callHiddenMethod(p, "h");
    }

    private static void callHiddenMethod(Protected p, String methodName) throws Exception {
        Method pm = p.getClass().getDeclaredMethod(methodName);
        pm.setAccessible(true);
        pm.invoke(p);
    }

}
