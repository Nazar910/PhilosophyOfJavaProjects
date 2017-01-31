package chapter14.ex251;

import chapter14.ex25.Protected;

import java.lang.reflect.Method;

/**
 * Created by pyvov on 30.01.2017.
 */
public class ProtectedTest {
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
