package chapter16.ex18;

import chapter16.arrays.BerylliumSphere;

/**
 * Created by nazar on 08/02/17.
 */
public class DecoratedBerylliumSphere extends BerylliumSphere {
        private int value = 0;

    public DecoratedBerylliumSphere() {
    }

    public DecoratedBerylliumSphere(int value) {
        this.value = value;
    }

    public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return super.toString() + " value = " + value;
        }
    }

