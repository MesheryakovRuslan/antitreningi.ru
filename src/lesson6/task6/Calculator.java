package lesson6.task6;

public class Calculator {

    public static <T extends Number,V extends Number> void  sum(T a,V x) {

        if(!(x instanceof Double || x instanceof Float)&&!(a instanceof Double || a instanceof Float)) {
           System.out.println(a.longValue() + x.longValue());
        } else if(!(x instanceof Double || x instanceof Float)||!(a instanceof Double || a instanceof Float)) {
            System.out.println(a.floatValue() + x.floatValue());
        }
    }

    public static <T extends Number,V extends Number> void  multiply(T a,V x) {

        if(!(x instanceof Double || x instanceof Float)&&!(a instanceof Double || a instanceof Float)) {
            System.out.println(a.longValue() * x.longValue());
        } else if(!(x instanceof Double || x instanceof Float)||!(a instanceof Double || a instanceof Float)) {
            System.out.println(a.floatValue() * x.floatValue());
        }
    }

    public static <T extends Number,V extends Number> void  divide(T a,V x) {

        if(!(x instanceof Double || x instanceof Float)&&!(a instanceof Double || a instanceof Float)) {
            System.out.println(a.longValue() / x.longValue());
        } else if(!(x instanceof Double || x instanceof Float)||!(a instanceof Double || a instanceof Float)) {
            System.out.println(a.floatValue() / x.floatValue());
        }
    }

    public static <T extends Number,V extends Number> void  subtraction(T a,V x) {

        if(!(x instanceof Double || x instanceof Float)&&!(a instanceof Double || a instanceof Float)) {
            System.out.println(a.longValue() - x.longValue());
        } else if(!(x instanceof Double || x instanceof Float)||!(a instanceof Double || a instanceof Float)) {
            System.out.println(a.floatValue() - x.floatValue());
        }
    }
}
