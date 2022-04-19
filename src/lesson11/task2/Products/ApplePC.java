package lesson11.task2.Products;

import lesson11.task2.Categories.ComputerTechnology;
import lesson11.task2.Color;
import lesson11.task2.Manufacturer.Apple;
import lesson11.task2.Technics;

import java.io.Serializable;


public class ApplePC extends Technics implements ComputerTechnology, Apple ,Serializable {

    public ApplePC(Color color, String name, int price, String model , int productsId){
        setColor(color);
        setName(name);
        setPrice(price);
        setModel(model);
        setProductsId(productsId);
    }

    @Override
    public void buyComputerTechnology(){}

    @Override
    public void buyApple() {}

    @Override
    public String toString() {
        return "Модель: "+ getModel() +"\n"+
                "Название: " + getName() + "\n" +
                "Цвет: " + getColor() + "\n" +
                "Цена: " + getPrice()+ "\n"+
                "Код товара: " + getProductsId();
    }
}