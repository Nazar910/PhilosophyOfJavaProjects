package chapter9.rodent;

/**
 * Created by pyvov on 30.12.2016.
 */
public class Mouse extends Rodent {
//    private Hamster hamster = new Hamster();
    @Override
    public void bite() {
        System.out.println("Mouse.bite()");
    }

    @Override
    public void run() {
        System.out.println("Mouse.run()");
    }


    public Mouse() {
        System.out.println("Mouse constructor");
    }

    public static void main(String[] args) {

//        Rodent[] array = {
//                new Hamster(),
//                new Mouse(),
//                new Mouse(),
//                new Hamster()
//        };
//        for(Rodent rodent: array) {
//            rodent.bite();
//        }
    }
}
