package Test;

public class Foo implements Runnable{
    public void first(){
        System.out.println("first");
    }
    public void second(){
        System.out.println("second");
    }
    public void third(){
        System.out.println("third");
    }

    @Override
    public void run() {
        second();
        first();
        third();
    }
}
