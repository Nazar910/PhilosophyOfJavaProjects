package chapter9.ex19;

import java.util.Random;

/**
 * Created by pyvov on 08.01.2017.
 */
interface Game {
    boolean throwed();
}

interface GameFactory {
    Game getGame();
}

class Coin implements Game {
    private int count = 0;
    private final int COUNT = 3;
    private Random rand = new Random();

    private String getResult() {
        return rand.nextInt(2) == 0 ? "Orel" : "Reshka";
    }

    public boolean throwed() {
        System.out.println("Get Coin " + getResult());
        return ++count != COUNT;
    }
}

class Cube implements Game {
    private int count = 0;
    private final int COUNT = 2;
    private Random rand = new Random();

    private int getResult() {
        return rand.nextInt(6) + 1;
    }

    public boolean throwed() {
        System.out.println("Get Cube " + getResult());
        return ++count != COUNT;
    }
}

class CoinFactory implements GameFactory {
    public Game getGame() {
        return new Coin();
    }
}

class CubeFactory implements GameFactory {
    public Game getGame() {
        return new Cube();
    }
}

public class Games {
    private static void playGame(GameFactory gf) {
        Game g = gf.getGame();
        while (g.throwed()) ;
    }

    public static void main(String[] args) {
        playGame(new CoinFactory());
    }
}
