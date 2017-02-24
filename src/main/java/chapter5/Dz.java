package chapter5;

/**
 * Created by pyvov on 19.10.2016.
 */
public class Dz {
    public static void main(String[] args) {
        dz12();
    }
    private static void dz1(){
        class A{
            private String str;

            public String getStr() {
                return str;
            }
        }
        A a = new A();
        System.out.println(a.getStr());
    }
    private static void dz2(){
        class A{
            private String s="a";
            private String str;
            public A(String str) {
                this.str = str;
            }
        }
        A a = new A("b");
    }
    private static void dz3(){
        class A{
            public A() {
                System.out.println("no-arg constructor");
            }
        }
        A a = new A();
    }
    private static void dz4(){
        class A{
            public A() {
                System.out.println("no-arg constructor");
            }
            public A(String message){
                System.out.println(message);
            }
        }
        A a = new A("a");
    }
    private static void dz5(){
        class Dog{
            public void bark(int a){ System.out.println("Лай");}
            public void bark(char a){ System.out.println("Завывание");}
            public void bark(byte a){ System.out.println("Поскуливание");}
            public void bark(short a){ System.out.println("Рычание");}
            public void bark(long a){ System.out.println("Вой");}
            public void bark(float a){ System.out.println("Рык");}
            public void bark(double a){ System.out.println("Зов");}
            public void bark(double a,int b){ System.out.println("Зов Рык");}
            public void bark(int a,double b){ System.out.println("Рык Зов");}
        }
        Dog dog = new Dog();
        dog.bark(1);
        dog.bark((byte)1);
        dog.bark((short)1);
        dog.bark('1');
        dog.bark(1L);
        dog.bark(1F);
        dog.bark(1D);
        dog.bark(1,1D);
        dog.bark(1D,1);
    }
    private static void dz8(){
        class A{
            void a(){
                b();
                this.b();
            }
            void b(){
                System.out.println("b");
            }
        }
        A a = new A();
        a.a();
    }
    private static void dz9() {
        class A{
            private int i;
            private String s;

            public A(int i, String s) {
                this.i = i;
                this.s = s;
            }

            public A() {
                this(10,"hello");
            }

            public int getI() {
                return i;
            }

            public String getS() {
                return s;
            }

            @Override
            public String toString() {
                return "BinaryFile = "+i+" s = "+s;
            }
        }
        A a = new A();
        A b = new A(12, "hi");
        System.out.println(a);
        System.out.println(b);
    }
    private static void dz10(){
        class A{
            private int i;

            public A() {
                i=10;
                System.out.println("Creating object A");
            }
            void checkIn(){
                i=0;
            }
            public void finalize(){
                if(i!=0) System.out.println("Error: BinaryFile!=0");
                else
                System.out.println("Terminating object A");
            }
        }
        A a = new A();
        a.checkIn();
        new A();
        new A().checkIn();
        System.gc();
    }
    private static void dz12(){
        class Tank{
            boolean filled;

            public Tank(boolean filled) {
                this.filled = filled;
            }
            public void isEmpty(){
                filled = false;
            }
            public void finalize(){
                if(filled) System.out.println("Error: filled");
            }
        }
        Tank tank = new Tank(true);
        tank.isEmpty();
        new Tank(true);
        System.gc();
    }
}
