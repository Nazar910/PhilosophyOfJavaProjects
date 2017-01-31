package chapter11.ex13;

import chapter10.innerclasses.Controller;
import chapter10.innerclasses.Event;

import java.util.Iterator;
import java.util.List;

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
        private List<Event> eventList;

        public Restart(long delayTime, List<Event> eventList) {
            super(delayTime);
            this.eventList = eventList;
            Iterator<Event> it = eventList.iterator();
            while ( it.hasNext()) {
                addEvent(it.next());
            }
        }



        public void action() {
            Iterator<Event> it = eventList.iterator();
            for (;it.hasNext();) {
                Event e = it.next();
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
