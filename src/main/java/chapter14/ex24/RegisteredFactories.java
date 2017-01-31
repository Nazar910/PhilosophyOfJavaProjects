package chapter14.ex24;

import chapter14.typeinfo.Null;
import chapter14.typeinfo.pets.factory.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by pyvov on 21.01.2017.
 */
class Part {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories =
            new ArrayList<Factory<? extends Part>>();

    static {
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
        partFactories.add(new NullPart.Factory());
        partFactories.add(new NullBelt.Factory());
        partFactories.add(new NullFilter.Factory());
    }

    private static Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}

class Filter extends Part {
}

class FuelFilter extends Filter {
    public static class Factory
            implements chapter14.typeinfo.pets.factory.Factory<FuelFilter> {
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter {
    public static class Factory
            implements chapter14.typeinfo.pets.factory.Factory<AirFilter> {
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory
            implements chapter14.typeinfo.pets.factory.Factory<CabinAirFilter> {
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter {
    public static class Factory
            implements chapter14.typeinfo.pets.factory.Factory<OilFilter> {
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part {}

class FanBelt extends Belt {
    public static class Factory
            implements chapter14.typeinfo.pets.factory.Factory<FanBelt> {
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory
            implements chapter14.typeinfo.pets.factory.Factory<GeneratorBelt> {
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory
            implements chapter14.typeinfo.pets.factory.Factory<PowerSteeringBelt> {
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}

class NullPart extends Part implements Null {
    public static class Factory
            implements chapter14.typeinfo.pets.factory.Factory<NullPart> {
        public NullPart create() {
            return new NullPart();
        }
    }
}

class NullFilter extends Filter implements Null {
    public static class Factory
            implements chapter14.typeinfo.pets.factory.Factory<NullFilter> {
        public NullFilter create() {
            return new NullFilter();
        }
    }
}

class NullBelt extends Belt implements Null {
    public static class Factory
            implements chapter14.typeinfo.pets.factory.Factory<NullBelt> {
        public NullBelt create() {
            return new NullBelt();
        }
    }
}

public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i< 10; i++ ) {
            System.out.println(Part.createRandom());
        }
    }

}
