package lesson11.task2.Products;

import lesson11.task2.Categories.GamingConsoles;
import lesson11.task2.Color;
import lesson11.task2.Manufacturer.Sony;
import lesson11.task2.Technics;

import java.io.Serializable;

public class SonyGame extends Technics implements GamingConsoles, Sony, Serializable {

    public SonyGame(Color color, String name, int price, String model, int productsId){
        setColor(color);
        setName(name);
        setPrice(price);
        setModel(model);
        setProductsId(productsId);
    }

    @Override
    public void buyConsoles(){}

    @Override
    public void buySony() {}

    @Override
    public String toString() {
        return "Модель: "+ getModel() +"\n"+
                "Название: " + getName() + "\n" +
                "Цвет: " + getColor() + "\n" +
                "Цена: " + getPrice()+ "\n"+
                "Код товара: " + getProductsId();
    }
}
