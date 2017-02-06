package chapter15.ex18;

import chapter15.generics.Generator;
import chapter15.generics.Generators;

import java.util.*;

/**
 * Created by nazar on 02/02/17.
 */
class LittleFish {
    private static long counter = 0;
    private final long id = counter++;

    private LittleFish() {
    }

    @Override
    public String toString() {
        return "LittleFish " + id;
    }

    public static Generator<LittleFish> generator() {
        return new Generator<LittleFish>() {
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }
}

class BigFish {
    private static long counter = 0;
    private final long id = counter++;

    private BigFish() {}

    @Override
    public String toString() {
        return "BigFish " + id;
    }

    public static Generator<BigFish> generator() {
        return new Generator<BigFish>() {
            public BigFish next() {
                return new BigFish();
            }
        };
    }
}

public class Ocean {
    public static void eat(BigFish bf, LittleFish lf) {
        System.out.println(bf + " eats " + lf);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<LittleFish> littleFishSet = new HashSet<LittleFish>();
        Generators.fill(littleFishSet, LittleFish.generator(), 10);
        List<BigFish> bigFishList = new ArrayList<BigFish>();
        Generators.fill(bigFishList, BigFish.generator(), 3);
        for (LittleFish lf : littleFishSet) {
            eat(bigFishList.get(rand.nextInt(bigFishList.size())), lf);
        }
    }
}
