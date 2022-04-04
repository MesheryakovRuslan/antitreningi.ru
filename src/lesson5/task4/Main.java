package lesson5.task4;

public class Main {
    public static void main(String[] args){
        String[] arrStr = {"апельсин","string","code", "Practice", "axe" , "Труба"};

        System.out.println(twoMiddleChar(arrStr));
    }

    public static String twoMiddleChar(String[] arrStr) {
       String var = "";

        for(int i = 0; arrStr.length > i; i++) {
            if((arrStr[i].length()&1) != 1) {
                int j = arrStr[i].length() / 2;
                var +=  arrStr[i].substring(j-1,j+1) + " ";
            }
        }
        return var;
    }
}
