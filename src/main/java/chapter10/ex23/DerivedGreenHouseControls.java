package chapter10.ex23;

import chapter10.innerclasses.Event;
import chapter10.innerclasses.GreenhouseControls;

/**
 * Created by pyvov on 11.01.2017.
 */
public class DerivedGreenHouseControls extends GreenhouseControls {
    private boolean wetting = false;
    public class WettingOn extends Event {
        public WettingOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            wetting = true;
        }

        @Override
        public String toString() {
            return "Wetting is on";
        }
    }

    public class WettingOff extends Event {
        public WettingOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            wetting = false;
        }

        @Override
        public String toString() {
            return "Wetting is off";
        }
    }
}
