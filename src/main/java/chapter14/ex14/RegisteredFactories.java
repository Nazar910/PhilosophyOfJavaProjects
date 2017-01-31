package chapter14.ex14;

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

    static List<Class<? extends Part>> partFactories =
            new ArrayList<Class<? extends Part>>();

    static {
        partFactories.add(FuelFilter.class);
        partFactories.add(AirFilter.class);
        partFactories.add(CabinAirFilter.class);
        partFactories.add(OilFilter.class);
        partFactories.add(FanBelt.class);
        partFactories.add(PowerSteeringBelt.class);
        partFactories.add(GeneratorBelt.class);
    }

    private static Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        try {
            return partFactories.get(n).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
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

public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i< 10; i++ ) {
            System.out.println(Part.createRandom());
        }
    }

}
