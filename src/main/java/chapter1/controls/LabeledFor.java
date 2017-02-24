package chapter1.controls;

/**
 * Created by pyvov on 18.10.2016.
 * Цикл с метками
 */
public class LabeledFor {
    public static void main(String[] args) {
        int i=0;
        outer:          //Другие команды недопустимы
        for(;true;){    //Infinite loop
            inner:      //Другие команды недопустимы
            for(;i<10;i++){
                System.out.println("BinaryFile = "+i);
                if(i == 2){
                    System.out.println("continue");
                    continue;
                }
                if(i == 3){
                    System.out.println("break");
                    i++;    //В противном случае і не увеличивается
                    break;
                }
                if(i == 7){
                    System.out.println("continue outer");
                    i++;    //В противном случае і не увеличивается
                    continue outer;
                }
                if(i == 8){
                    System.out.println("break outer");
                    break outer;
                }
                for(int k = 0; k < 5; k++){
                    if(k == 3){
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
        // Использовать break или continue с метками здесь не разрешается
    }
}
