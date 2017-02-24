package chapter19.enumerated;

import java.util.EnumMap;
import java.util.Map;

import static chapter19.enumerated.AlarmPoints.*;

/**
 * Created by pyvov on 24.02.2017.
 */
interface Command { void action(); }

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
        em.put(KITCHEN, ()-> System.out.println("Kitchen fire!"));
        em.put(BATHROOM, ()-> System.out.println("Bathroom alert!"));
        for (Map.Entry<AlarmPoints, Command> entry : em.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            entry.getValue().action();
        }
        try {
            em.get(UTILITY).action();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
