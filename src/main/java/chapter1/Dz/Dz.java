package chapter1.Dz;

import java.util.Scanner;

/**
 * Created by pyvov on 18.10.2016.
 */
public class Dz {
    public static void main(String[] args) {
        dz23(5);
    }
    private static void dz18(){
        Scanner scanner = new Scanner(System.in);
        for(;;){
            System.out.println("Enter a number: ");
            int a =scanner.nextInt();
            boolean fl=false;
            for(int i=2;i<a && !fl;i++)
                if(a % i == 0)
                    fl=true;
            if(fl)
                System.out.println("Number is not simple!");
            else
                System.out.println("Number is simple!");
        }
    }
    private static void dz9(){
        double d = Double.MAX_VALUE;
        float f = Float.MAX_VALUE;
        System.out.println("d = "+d);
        System.out.println("f = "+f);
    }
    private static void dz10(){
        int a = 10; //младший бит равен 0 1010
        int b = 7;  //старший бит равен 0 0111
        System.out.println("a = "+Integer.toBinaryString(a));
        System.out.println("b = "+Integer.toBinaryString(b));
        System.out.println("a&b = "+Integer.toBinaryString(a&b));
        System.out.println("a|b = "+Integer.toBinaryString(a|b));
        System.out.println("a^b = "+Integer.toBinaryString(a^b));
        System.out.println("~a = "+Integer.toBinaryString(~a));
        System.out.println("~b = "+Integer.toBinaryString(~b));
    }
    private static void dz22(){
        for(int i=0;i<10;i++){
            switch(i){
                case 0:
                    System.out.println("case 0");
                    //break;
                case 1:
                    System.out.println("case 1");
                    //break;
                case 2:
                    System.out.println("case 2");
                    //break;
                case 3:
                    System.out.println("case 3");
                    //break;
                case 4:
                    System.out.println("case 4");
                    //break;
                case 5:
                    System.out.println("case 5");
                    //break;
                case 6:
                    System.out.println("case 6");
                    //break;
                case 7:
                    System.out.println("case 7");
                    //break;
                case 8:
                    System.out.println("case 8");
                    //break;
                case 9:
                    System.out.println("case 9");
                    //break;
                default:
                    System.out.println("default");
            }
        }
    }
    private static void dz23(int n){
        int a=0,b=1;                    //two operands of Fibonacci
        System.out.print("1 ");
        for(int i=1;i<n;i++){
            System.out.print(a+b+" ");
            b=a+b;
            a=b-a;
        }
    }
    private static void dz24(){
        for(int n = 1000;n<10000;n++) { //n is probably a vampire number
            int i=0,j=0;                //i & j are forming vampire number;
            boolean fl = false;         //fl is a state from what we know if we find our vampire number
            out:
            for(i=10;i<100;i++){
                for(j=10;j<100;j++){
                    if(i*j == n){
                        fl=true;
                        break out;
                    }
                }
            }
            if(fl)
                System.out.println(n+" = "+i+" * "+j);
        }
    }

}
