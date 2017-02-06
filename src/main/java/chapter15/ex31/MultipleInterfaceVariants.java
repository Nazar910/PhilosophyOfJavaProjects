package chapter15.ex31;

/**
 * Created by nazar on 05/02/17.
 */

interface Payable {}

class Empployee implements Payable {}

class Hourly extends Empployee implements Payable {}

public class MultipleInterfaceVariants {
}
