package Upcasting;

public class Lion implements Animal{
    @Override
    public void eat() {
        System.out.println("Lion is eating ");
    }

    @Override
    public void drink() {
        System.out.println("Lion is drinking water");
    }

    @Override
    public void walk() {
        System.out.println("Lion is running");
    }
}
