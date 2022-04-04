package lesson3.task3;

public enum Seasons {
    WINTER("Зима",-10),
    SPRING("Весна",10),
    SUMMER("Лето",17) {
        @Override
        public  String getDescription() {
            return " Тёплое время года ";
        }
    },
    AUTUMN("Осень",10);

    private String seasonsName;
    private int averageTemperature;

    Seasons(String seasonsName, int averageTemperature) {
        this.seasonsName = seasonsName;
        this.averageTemperature = averageTemperature;
    }

    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getDescription() {
        return " Холодное время года ";
    }

    public static void favoriteSeasons(Seasons favoriteSeasons) {
        switch (favoriteSeasons) {
            case AUTUMN:System.out.println("Я люблю Осень");
                break;
            case SPRING:System.out.println("Я люблю Весну");
                break;
            case WINTER:System.out.println("Я люблю Зиму");
                break;
            case SUMMER:System.out.println("Я люблю Лето");
                break;
        }
    }

    public String getSeasonsName() {
        return seasonsName;
    }

    public void setSeasonsName(String seasonsName) {
        this.seasonsName = seasonsName;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
}
