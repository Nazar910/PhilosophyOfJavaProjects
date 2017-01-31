package chapter1.Scope;

/**
 * Created by pyvov on 23.09.2016.
 */
public class Scope1 {
    {
        int x=12;
        //доступно только х
        {
            int q = 96;
            //доступні как q так и x
        }
        //досупно только х
        //q находится "за пределами видимостиЭ
    }
    {
        int x=12;
        {
            //int x=96; //   неверно
            //variable x is already defined in the scope
        }

    }

}
