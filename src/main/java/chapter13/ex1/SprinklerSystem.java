package chapter13.ex1;

/**
 * Created by pyvov on 15.01.2017.
 */
class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("WaterSource()");
        s = "build";
    }

    @Override
    public String toString() {
        return this.s;
    }
}

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        //much more code and no difference with chapter7/reusing/SprinklerSystem.java
        StringBuilder builder = new StringBuilder("");
        builder.append("valve1 = ");
        builder.append(valve1);
        builder.append(" ");
        builder.append("valve2 = ");
        builder.append(valve2);
        builder.append(" ");
        builder.append("valve3 = ");
        builder.append(valve3);
        builder.append(" ");
        builder.append("valve4 = ");
        builder.append(valve4);
        builder.append('\n');
        builder.append("BinaryFile = ");
        builder.append(i);
        builder.append(" ");
        builder.append("f = ");
        builder.append(f);
        builder.append(" ");
        builder.append("source = ");
        builder.append(source);
        return builder.toString();
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}

