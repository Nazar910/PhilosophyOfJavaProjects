package chapter11.holding;

import java.util.Map;

/**
 * Created by pyvov on 13.01.2017.
 */
public class EnvironmentalVariables {
    public static void main(String[] args) {
        for (Map.Entry entry: System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
