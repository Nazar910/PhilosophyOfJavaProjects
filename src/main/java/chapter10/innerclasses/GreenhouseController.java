package chapter10.innerclasses;

/**
 * Created by pyvov on 11.01.2017.
 */
public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();

        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(0),
                gc.new LightOff(0),
                gc.new WaterOn(0),
                gc.new WaterOff(0),
                gc.new ThermostatDay(0)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
//        if(args.length == 1) {
            gc.addEvent(new GreenhouseControls.Terminate(
                    new Integer(100)));//args[0])));

//        }
        gc.run();
    }
}
