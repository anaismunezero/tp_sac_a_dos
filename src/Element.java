import java.util.Random;

public class Element {
    private int weight;
    private int value;


    public Element(int weight, int valeur) {
        this.weight = weight;
        this.value = valeur;
    }
    public Element(){
        Random randomWeight =new Random();
        Random randomValue= new Random();
        this.weight =randomWeight.nextInt(50);
        this.value=randomValue.nextInt(100);
    }

    public int getWeight() {
        return weight;
    }

    public int getVvalue() {
        return value;
    }
}
