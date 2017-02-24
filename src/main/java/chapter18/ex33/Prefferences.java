package chapter18.ex33;

import java.util.Scanner;
import java.util.prefs.Preferences;

/**
 * Created by pyvov on 24.02.2017.
 */
public class Prefferences {
    public static void main(String[] args) {
        Preferences preferences = Preferences.userNodeForPackage(Prefferences.class);
        int n = preferences.getInt("key", 0);
        System.out.println("Current value is: " + n);
        Scanner scanner = new Scanner(System.in);
        System.out.println("New value is: ");
        n = scanner.nextInt();
        preferences.putInt("key", n);
    }
}
