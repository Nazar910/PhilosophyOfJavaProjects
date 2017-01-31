package chapter13.strings;

/**
 * Created by pyvov on 15.01.2017.
 */
public class DatabaseException extends Exception {
    public DatabaseException(int transactionID, int queryId, String message) {
        super(String.format("(t%d, q%d) %s", transactionID, queryId, message));
    }

    public static void main(String[] args) {
        try {
            throw new DatabaseException(3, 7, "Write error");
        } catch (DatabaseException e) {
            System.err.print(e);
        }
    }
}
