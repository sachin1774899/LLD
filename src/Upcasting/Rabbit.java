package Upcasting;

public class Rabbit implements Animal{
    @Override
    public void eat() {
        System.out.println("Rabbit is eating");
    }

    @Override
    public void drink() {
        System.out.println("Rabbit is drinking water");
    }

    @Override
    public void walk() {
        System.out.println("Rabbit is hopping");
    }
}
