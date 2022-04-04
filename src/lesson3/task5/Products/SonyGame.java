package lesson3.task5.Products;

import lesson3.task5.Categories.GamingConsoles;
import lesson3.task5.Color;
import lesson3.task5.Manufacturer.Sony;
import lesson3.task5.Technics;

public class SonyGame extends Technics implements GamingConsoles, Sony {

    public SonyGame(Color color, String name, int price, String model,int productsId){
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
