package chapter10.ex22;

import java.security.spec.ECFieldF2m;

/**
 * Created by pyvov on 11.01.2017.
 */
public class GreenhouseControls extends Controller {
    private boolean light = false;

    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            //
            //
            light = true;
        }

        @Override
        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            //
            //
            light = false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }

    private boolean water = false;

    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            //
            water = true;
        }

        @Override
        public String toString() {
            return "Water is on";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            //
            water = false;
        }

        @Override
        public String toString() {
            return "Water is off";
        }
    }

    private String thermostat = "Day";

    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        public void action() {
            //
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Thermostat using night mode";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        public void action() {
            //
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Thermostat using day mode";
        }
    }
    private boolean ventilating = false;
    public class VentilatingOn extends Event {
        public VentilatingOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            //
            ventilating = true;
        }

        @Override
        public String toString() {
            return "Ventilation is on";
        }
    }

    public class VentilatiionOff extends Event {
        public VentilatiionOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            //
            ventilating = false;
        }

        @Override
        public String toString() {
            return "Ventilation is off";
        }
    }

    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }

        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Boom!";
        }
    }

    public class Restart extends Event {
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList) {
                addEvent(e);
            }
        }

        public void action() {
            for (Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Restarting the system";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }

        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Off";
        }
    }

}
