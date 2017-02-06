package chapter15.generics;

/**
 * Created by nazar on 04/02/17.
 */
public class CaptureConversion {
    static <T> void f1(Holder<T> holder) {
        T t = holder.getValue();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder) {
        f1(holder);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Holder raw = new Holder<Integer>(1);
//        f1(raw);
        f2(raw);
        Holder rawBasic = new Holder();
        rawBasic.setValue(new Object());
        f2(rawBasic);

        Holder<?> wildCarded = new Holder<Double>(1.0);
        f2(wildCarded);
    }
}
