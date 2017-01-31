package chapter8.inheritane.in.design;

/**
 * Created by pyvov on 02.01.2017.
 */
class AlertStatus {
    public void alert() {
    }
}

class AlertStatusGreen extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("Alert Green!");
    }
}

class AlertStatusRed extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("Alert Red");
    }
}

public class Starship {
    private AlertStatus alertStatus = new AlertStatusGreen();

    void checkAlert() {
        alertStatus.alert();
    }

    void change() {
        alertStatus = new AlertStatusRed();
    }

    public static void main(String[] args) {
        Starship ship = new Starship();
        ship.checkAlert();
        ship.change();
        ship.checkAlert();
    }
}
