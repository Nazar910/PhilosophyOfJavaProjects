package chapter14.project;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by pyvov on 26.01.2017.
 */

interface AbstractTransaction {
    void execute() throws IOException;
}

class Transaction implements AbstractTransaction {
    public void execute() throws IOException {

    }
}


class DynamicProxyTransactionHandler implements InvocationHandler {
    private Object proxied;

    public DynamicProxyTransactionHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}

public class TransactionSystem {
}
