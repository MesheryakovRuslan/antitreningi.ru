package lesson6.task2;

public class Main {
    public static void main(String[] args) {
        Food food = new Food();

        Cookable cookable = new Cookable() {
            @Override
            public void cook(String str){
                System.out.format("Готовка : %s ", str);
            }
        };

        food.prepare(cookable,"еды");
    }
}
