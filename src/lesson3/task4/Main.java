package lesson3.task4;

public class Main {
    public static void main (String[] args){

        Clothes[] clothes = new Clothes[10];
        clothes[0] = new TeeShirt(ClothesSize.L,700,"Зелёный");
        clothes[1] = new Pants(ClothesSize.M,2000,"чёрный");
        clothes[2] = new Skirt(ClothesSize.XS,2000,"белый");
        clothes[3] = new Tie(ClothesSize.L,2500,"Бордовый");
        clothes[4] = new Pants(ClothesSize.XXS,2000,"чёрный");
        clothes[5] = new TeeShirt(ClothesSize.L,1700,"синий");
        clothes[6] = new Pants(ClothesSize.M,2100,"фиолетовый");
        clothes[7] = new Skirt(ClothesSize.S,2200,"черный");
        clothes[8] = new Tie(ClothesSize.L,4000,"серый");
        clothes[9] = new Skirt(ClothesSize.XXS,2200,"черный");

        Atelier atelier = new Atelier();
        System.out.println("Вывод универсальной и женской одежды \n");
        atelier.dressAWomen(clothes);
        System.out.println("Вывод универсальной и мужской одежды \n");
        atelier.dressAMan(clothes);





    }
}
