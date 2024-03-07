package Upcasting;

public class PlayAnimal {
    private Animal animal;

    public PlayAnimal(){
        animal = new Lion();
    }

    public void doAnimalThings(){
        animal.eat();
        animal.walk();
        animal.drink();
    }
}
