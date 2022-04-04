package lesson3.task4;

public class Atelier {

    public void dressAMan(Clothes[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] instanceof ManClothes) {
                System.out.println("Наименование: " + arr[i].getName() + "\n" +
                        "Размер: " + arr[i].getSizeClothes() + "\n"+
                        "Цвет: " + arr[i].getColorClothes() + "\n"+
                        "Цена: " + arr[i].getPriceClothes()+ "\n");
            }
        }
    }


    public void dressAWomen(Clothes[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] instanceof WomenClothes) {
                System.out.println("Наименование: " + arr[i].getName() + "\n" +
                        "Размер: " + arr[i].getSizeClothes() + "\n"+
                        "Цвет: " + arr[i].getColorClothes() + "\n"+
                        "Цена: " + arr[i].getPriceClothes()+ "\n");
            }
        }
    }
}
