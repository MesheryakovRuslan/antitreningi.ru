package lesson11.task1;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    private String horseType;
    private int horseId;

    public Horse(String color, int age, String name, String horseType, int horseId) {
        super(color, age, name);
        this.horseType = horseType;
        this.horseId = horseId;
    }

    public int getHorseId() {
        return horseId;
    }

    public void setHorseId(int horseId) {
        this.horseId = horseId;
    }

    public String getHorseType() {
        return horseType;
    }

    public void setHorseType(String horseType) {
        this.horseType = horseType;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "horseType='" + horseType + '\'' +
                ", horseId=" + horseId +
                '}';
    }
}
