package lesson2.task1;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Phone onePhone = new Phone("89111111111","A15","40");
        System.out.println("Number: " + onePhone.getNumber() + " Model: " + onePhone.getModel() + " Weight: " + onePhone.getWeight());

        Phone twoPhone = new Phone("89222222222","A40","40");
        System.out.println("Number: " + twoPhone.getNumber() + " Model: " + twoPhone.getModel() + " Weight: " + twoPhone.getWeight());

        Phone threePhone = new Phone("89333333333","A50","45");
        System.out.println("Number: " + threePhone.getNumber() + " Model: " + threePhone.getModel() + " Weight: " + threePhone.getWeight());

        Phone fourPhone = new Phone("89444444444","A30");
        System.out.println("Number: " + fourPhone.getNumber() + " Model: " + fourPhone.getModel() + " Weight: " + fourPhone.getWeight());

        Phone fivePhone = new Phone();
        System.out.println("Number: " + fivePhone.getNumber() + " Model: " + fivePhone.getModel() + " Weight: " + fivePhone.getWeight());

        Phone sixPhone = new Phone("89111111111","A15","40");
        System.out.println("Number: " + onePhone.getNumber() + " Model: " + onePhone.getModel() + " Weight: " + onePhone.getWeight());

        onePhone.receiveCall("Светлана","89000000000");
        onePhone.receiveCall("Светлана");

        threePhone.sendMessageс(onePhone.getNumber(),twoPhone.getNumber(),fourPhone.getNumber());

        System.out.println(onePhone);
        System.out.println(onePhone.equals(sixPhone));
        System.out.println(onePhone.hashCode() +" = "+ sixPhone.hashCode());
        System.out.println("count Phone class = " + Phone.count);
    }
}
