package lesson11.task2;

public enum Color {
    BLACK("Черный"),
    WHITE("Белый"),
    GREY("Серый"),
    CUSTOM("Кастомный");

    String name;

    Color(String name){}

    public String getName() {
        return name;
    }
}
