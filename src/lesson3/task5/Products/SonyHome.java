package lesson3.task5.Products;

import lesson3.task5.Categories.HouseholdAppliances;
import lesson3.task5.Color;
import lesson3.task5.Manufacturer.Sony;
import lesson3.task5.Technics;

public class SonyHome extends Technics implements HouseholdAppliances, Sony {

    public SonyHome(Color color, String name, int price, String model,int productsId){
        setColor(color);
        setName(name);
        setPrice(price);
        setModel(model);
        setProductsId(productsId);
    }

    @Override
    public void buyComputerTechnology(){}

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