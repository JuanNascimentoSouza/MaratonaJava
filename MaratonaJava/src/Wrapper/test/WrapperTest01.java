package Wrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long lognP = 1;
        float floatP = 1f;
        double doubleP = 100;
        char charP = 'w';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //autoboxing
        Long lognW = 1L;
        Float floatW = 1f;
        Double doubleW = 100D;
        Character charW = 'w';
        Boolean booleanW = false;

        int i = intW; //unboxing

        Integer intW2 = Integer.parseInt("1");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('!'));
        System.out.println(Character.isLowerCase('!'));
        System.out.println(Character.toLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
    }
}