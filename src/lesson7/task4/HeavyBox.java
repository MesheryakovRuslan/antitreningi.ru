package lesson7.task4;

public class HeavyBox {
    private double weight;

    public HeavyBox(double weight) {
        this.weight = weight;
    }

    public HeavyBox(){
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight='" + weight + '\'' +
                '}';
    }
}
