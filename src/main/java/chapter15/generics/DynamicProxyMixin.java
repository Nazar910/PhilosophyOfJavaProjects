package chapter15.generics;

import chapter15.ex37.*;
import chapter15.ex37.Mixins;
import chapter15.generics.tuples.TwoTuple;

import java.awt.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import static chapter15.generics.tuples.Tuple.*;

/**
 * Created by nazar on 06/02/17.
 */
class MixinProxy implements InvocationHandler {
    Map<String, Object> delegatesMethod;

    public MixinProxy(TwoTuple<Object, Class<?>>... pairs) {
        delegatesMethod = new HashMap<String, Object>();
        for(TwoTuple<Object, Class<?>> pair : pairs) {
            for(Method m : pair.second.getMethods()) {
                String methodName = m.getName();
                if (!delegatesMethod.containsKey(methodName))
                    delegatesMethod.put(methodName, pair.first);
            }
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Object delegate = delegatesMethod.get(methodName);
        return method.invoke(delegate, args);
    }

    @SuppressWarnings("unchecked")
    public static Object newInstance(TwoTuple... pairs) {
        Class[] interfaces = new Class[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            interfaces[i] = (Class) pairs[i].second;
        }
        ClassLoader cl = pairs[0].first.getClass().getClassLoader();
        return Proxy.newProxyInstance(cl, interfaces, new MixinProxy(pairs));
    }
}

interface ColoredInt {
    java.awt.Color getColor();
}

class ColoredIntImp implements ColoredInt {
    private java.awt.Color color = Color.black;

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}


public class DynamicProxyMixin {
    public static void main(String[] args) {
        Object mixin = MixinProxy.newInstance(
                tuple(new BasicImp(), Basic.class),
                tuple(new TimeStampedImp(), TimeStamped.class),
                tuple(new SerialNumberedImp(), SerialNumbered.class),
                tuple(new ColoredIntImp(), ColoredInt.class)
        );

        Basic b = (Basic)mixin;
        b.set("Hello");
        TimeStamped t = (TimeStamped)mixin;
        SerialNumbered s = (SerialNumbered)mixin;
        ColoredInt c = (ColoredInt) mixin;
        System.out.println(b.get());
        System.out.println(t.getStamp());
        System.out.println(s.getSerialNumber());
        System.out.println(c.getColor());
    }
}
