package chapter10.ex12;

/**
 * Created by pyvov on 10.01.2017.
 */
interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

public class HorrorShow {
    static DangerousMonster getDragonZilla() {
        return new DangerousMonster() {
            public void destroy() {

            }

            public void menace() {

            }
        };
    }

    static Vampire getVeryBadVampire() {
        return new Vampire() {
            public void drinkBlood() {

            }

            public void destroy() {

            }

            public void kill() {

            }

            public void menace() {

            }
        };
    }

    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = getDragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = getVeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}