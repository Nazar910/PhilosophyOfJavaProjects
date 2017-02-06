package chapter15.ex21;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nazar on 03/02/17.
 */
class Building {}

class House extends Building {}

public class ClassTypeCapture {
    Map<String, Class<?>> kinds = new HashMap<String, Class<?>>();

    public void addType(String typeName, Class<?> kind) {
        kinds.put(typeName, kind);
    }

    public Object createNew(String typeName) {
        try {
            return kinds.get(typeName).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {
        ClassTypeCapture ctc = new ClassTypeCapture();
        ctc.addType("String", String.class);
        ctc.addType("Double", Double.class);
        System.out.println(ctc.createNew("String"));
    }
}
