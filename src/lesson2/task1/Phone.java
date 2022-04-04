package lesson2.task1;

public class Phone implements java.io.Serializable{

    private String number;
    private String model;
    private String weight;
    static int count = 0;

    Phone(String number, String model, String weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
        count++;
    }

    Phone(String number, String model){
        this.number = number;
        this.model = model;
        count++;
    }

    public Phone(){
        count++;
    }

    public void receiveCall(String name){
        System.out.println("Звонит: "+ name);
    }
    public void receiveCall(String name, String number){
        System.out.println("Звонит: "+ name + " номер:" + number);
    }
    public void sendMessageс(String... number){
        System.out.println("Сообщение отправленно: ");
        for (int i = 0; i < number.length; i++) System.out.println(number[i]);
    }

    // Методы геттеры (get) и сеттеры (set)
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getWeight(){
        return weight;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }

    //Переопределенные методы equals(), hashCode() и toString().
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return number == phone.number && model == phone.model && weight == phone.weight;
    }

    @Override
    public int hashCode(){
        int result = 0;
        result += number == null ? 0 : number.hashCode();
        result += model == null ? 0 : model.hashCode();
        result += weight == null ? 0 : weight.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model=" + model +
                ", weight=" + weight +
                '}';
    }
}
