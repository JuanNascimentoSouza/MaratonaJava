package classesinternas.test;

public class OuterClassesTest02 {
    private String name = "Midorya";

    void print() {
        String lastName = "Izuku";
        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();

    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
