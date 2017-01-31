package chapter7.upcasting;

/**
 * Created by pyvov on 19.12.2016.
 */
public class Amphibian {
    public void foo(){
        System.out.println("--foo--");
    }
    public void bar(){
        System.out.println("--bar--");
    }
    public void foo(Amphibian amphibian){
        System.out.println("--amphibian--");
        foo();
        bar();
    }
}
