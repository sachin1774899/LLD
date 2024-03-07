package Semaphore;

public class Tshirt {
    int height;
    int weight;
    String color;

    public Tshirt() {
    }
    public Tshirt(Tshirt tshirt){
        this.height = tshirt.height;
        this.weight = tshirt.weight;
        this.color = tshirt.color;
    }
    public Tshirt(int pheight, int pweight, String pcolor){
        this.height = pheight;
        this.weight = pweight;
        this.color = pcolor;
    }
}
