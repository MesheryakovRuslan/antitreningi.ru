package lesson3.task3;

public class Main {
    public static void main(String[] args) {
        Seasons[] seasonsArray = Seasons.values();

        Seasons seasons = Seasons.SPRING;
        System.out.println("----------Любимое время года----------");
        Seasons.favoriteSeasons(seasons);
        System.out.println("----------Любимое время года информация----------");
        infoSeasons(seasons);
        System.out.println();
        System.out.println("----------Времена года----------");

        for(int i = 0; i < seasonsArray.length; i++) {
            infoSeasons(seasonsArray[i]);
        }
    }

    static void infoSeasons(Seasons seasons) {
        System.out.println("Название времени года: "
                + seasons.getSeasonsName()
                + " Средняя температура "
                + seasons.getAverageTemperature()
                + " градусов"
                + seasons.getDescription());
    }

}
