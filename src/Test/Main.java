package Test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Foo());
        Thread t2 = new Thread(new Foo());
        Thread t3 = new Thread(new Foo());
        Thread t4 = new Thread(new Foo());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
