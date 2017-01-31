package chapter5.Initialization;

/**
 * Created by pyvov on 20.10.2016.
 * Demonstrating order of initialization
 */
//By calling of constructor to create object Window show message
class Window{
    Window(int marker){
        System.out.println("Window("+marker+")");
    }
}
class House{
    Window w1 = new Window(1);//before constructor

    public House() {
        //Show that executing constructor
        System.out.println("House()");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f(){
        System.out.println("f()");
    }
    Window w3 = new Window(3);
}
public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}
