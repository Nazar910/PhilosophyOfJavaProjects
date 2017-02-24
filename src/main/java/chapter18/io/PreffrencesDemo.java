package chapter18.io;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * Created by pyvov on 24.02.2017.
 */
public class PreffrencesDemo {
    public static void main(String[] args) throws BackingStoreException {
        Preferences prefs = Preferences.userNodeForPackage(PreffrencesDemo.class);
        prefs.put("Location", "Oz");
        prefs.put("Footwear", "Ruby Slippers");
        prefs.putInt("Companions", 4);
        prefs.putBoolean("Are there witchers", true);
        int usageCount = prefs.getInt("UsageCount", 0);
        usageCount++;
        prefs.putInt("UsageCount", usageCount);
        for (String key : prefs.keys()) {
            System.out.println(key + ": " + prefs.get(key,null));
        }
        System.out.println("How many companions does Dorothy have? " +
                prefs.getInt("Companions", 0));
    }
}
