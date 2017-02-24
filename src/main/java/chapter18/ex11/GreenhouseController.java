package chapter18.ex11;

import chapter10.innerclasses.Event;
import chapter10.innerclasses.GreenhouseControls;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by pyvov on 11.01.2017.
 */
public class GreenhouseController {
    public static void main(String[] args) throws IOException {
        GreenhouseControls gc = new GreenhouseControls();
        BufferedReader in = new BufferedReader(
                new FileReader("src/main/java/chapter18/ex11/schedule.txt"));
        String s;
        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
        while ((s = in.readLine()) != null) {
            String[] ar =s.split(" ");
            hashMap.put(ar[0],Integer.parseInt(ar[1]));
        }
        in.close();
        List<EventFactory> factories = new ArrayList<>();
        int i = 0;
        for (String s1 : hashMap.keySet()) {
            switch(s1) {
                case "ThermostatDay":
                    factories.add(new ThermostatFactory(gc, FlagsDayNight.DAY));
                    break;
                case "ThermostatNight":
                    factories.add(new ThermostatFactory(gc, FlagsDayNight.NIGHT));
                    break;
                case "LightOn":
                    factories.add(new LightFactory(gc, FlagsOnOff.ON));
                    break;
                case "LightOff":
                    factories.add(new LightFactory(gc, FlagsOnOff.OFF));
                    break;
                case "WaterOn":
                    factories.add(new WaterFactory(gc, FlagsOnOff.ON));
                    break;
                case "WaterOff":
                    factories.add(new WaterFactory(gc, FlagsOnOff.OFF));
                    break;
            }
        }
//
        gc.addEvent(gc.new Bell(900));
//        Event[] eventList = {
//                gc.new ThermostatNight(0),
//                gc.new LightOn(0),
//                gc.new LightOff(0),
//                gc.new WaterOn(0),
//                gc.new WaterOff(0),
//                gc.new ThermostatDay(0)
//        };
        Event[] eventList = new Event[hashMap.keySet().size()];
        for (Integer delay : hashMap.values()) {
            eventList[i] = factories.get(i)
                    .newEvent(delay);
            i++;
        }
        gc.addEvent(gc.new Restart(2000, eventList));
////        if(args.length == 1) {
            gc.addEvent(new GreenhouseControls.Terminate(
                    100));//args[0])));
//
////        }
        gc.run();
    }
}


enum FlagsDayNight {
    NIGHT, DAY
}

enum FlagsOnOff {
    ON, OFF
}


abstract class EventFactory {
    protected GreenhouseControls gc;

    protected EventFactory(GreenhouseControls gc) {
        this.gc = gc;
    }

    abstract public Event newEvent(Integer delay);
}

class ThermostatFactory extends EventFactory {
    private FlagsDayNight flag;

    @Override
    public Event newEvent(Integer delay) {
        return flag.equals(FlagsDayNight.DAY) ?
                gc.new ThermostatDay(delay) :
                gc.new ThermostatNight(delay);
    }

    public ThermostatFactory(GreenhouseControls gc, FlagsDayNight flag) {
        super(gc);
        this.flag = flag;
    }
}

class LightFactory extends EventFactory {
    private FlagsOnOff flag;

    protected LightFactory(GreenhouseControls gc, FlagsOnOff flag) {
        super(gc);
        this.flag = flag;
    }

    @Override
    public Event newEvent(Integer delay) {
        return flag.equals(FlagsOnOff.ON) ?
             gc.new LightOn(delay) :
             gc.new LightOff(delay);
    }
}

class WaterFactory extends EventFactory {
    private FlagsOnOff flag;

    protected WaterFactory(GreenhouseControls gc, FlagsOnOff flag) {
        super(gc);
        this.flag = flag;
    }

    @Override
    public Event newEvent(Integer delay) {
        return flag.equals(FlagsOnOff.ON) ?
                gc.new WaterOn(delay) :
                gc.new WaterOff(delay);
    }
}
