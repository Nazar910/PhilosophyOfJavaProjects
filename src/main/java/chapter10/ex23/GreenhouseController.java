package chapter10.ex23;

import chapter10.innerclasses.Event;

/**
 * Created by pyvov on 11.01.2017.
 */
public class GreenhouseController {
    public static void main(String[] args) {
        DerivedGreenHouseControls gc = new DerivedGreenHouseControls();

        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(0),
                gc.new LightOff(0),
                gc.new WaterOn(0),
                gc.new WaterOff(0),
                gc.new WettingOn(0),
                gc.new WettingOff(0),
                gc.new ThermostatDay(0)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
//        if(args.length == 1) {
            gc.addEvent(new DerivedGreenHouseControls.Terminate(
                    100));//args[0])));

//        }
        gc.run();
    }
}
