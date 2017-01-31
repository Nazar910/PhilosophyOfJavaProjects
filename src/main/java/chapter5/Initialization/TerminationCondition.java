package chapter5.Initialization;

/**
 * Created by pyvov on 20.10.2016.
 */
class Book {
    boolean checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }
    void checkIn(){
        checkedOut = false;
    }
    public void finalize(){
        if(checkedOut)
            System.out.println("Error : checkedOut");
        // Usually it is doing by this way
        // Super.finalize
    }
}
public class TerminationCondition{
    public static void main(String[] args) {
        Book novel = new Book(true);
        //Right way of cleaning
        novel.checkIn();
        // Loosing link, forget about cleaning
        new Book(true);
        //forced garbage cleaning and finalizing
        System.gc();
    }
}
