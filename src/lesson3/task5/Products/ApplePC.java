package lesson3.task5.Products;

import lesson3.task5.Categories.ComputerTechnology;
import lesson3.task5.Color;
import lesson3.task5.Manufacturer.Apple;
import lesson3.task5.Technics;


public class ApplePC extends Technics implements ComputerTechnology, Apple {

    public ApplePC(Color color, String name, int price, String model ,int productsId){
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