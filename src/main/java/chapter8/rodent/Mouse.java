package chapter8.rodent;

/**
 * Created by pyvov on 30.12.2016.
 */
public class Mouse extends Rodent {
//    private Hamster hamster = new Hamster();
    private Shared shared;
    @Override
    public void bite() {
        System.out.println("Mouse.bite()");
    }

    @Override
    public void run() {
        System.out.println("Mouse.run()");
    }

    public void compose(Shared shared) {
        this.shared = shared;
        this.shared.addRef();
    }

    public Mouse() {
        System.out.println("Mouse constructor");
    }
    protected void dispose() {
        System.out.println("Mouse.dispose()");
        this.shared.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Shared shared = new Shared();
        Mouse mouse1 = new Mouse();
        mouse1.compose(shared);
        Mouse mouse2 = new Mouse();
        mouse2.compose(shared);
        mouse1.dispose();
        mouse2.dispose();
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
