package optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("ABCDE");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(02);
        System.out.println(03);

        Optional<String> nameOptional = Optional.ofNullable(findName("William"));
        System.out.println(nameOptional);
    }

    private static String findName(String name) {
        List<String> list = List.of("William", "Devdojo");
        int i = list.indexOf(name);
        if (i > 0) {
            return list.get(i);
        }
        return null;
    }
}