package chapter15.generics;

/**
 * Created by nazar on 06/02/17.
 */
class CommunicateSimply {
    public static void perform(Performs performs) {
        performs.speak();
        performs.sit();
    }
}

public class SimpleDogsAndRobots {
    public static void main(String[] args) {
        CommunicateSimply.perform(new PerformingDog());
        CommunicateSimply.perform(new Robot());
    }
}
