import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] arrs = {"ab", "cde", "xyz", "ab", "fgh", "cde", "bl"};
        Stream<String> st1 = Arrays.stream(arrs);
        long c1 = st1.filter(s -> s.length() < 3).count();
        System.out.println(c1);
        st1 = Arrays.stream(arrs);
        System.out.println(st1.skip(4).count());
        st1 = Arrays.stream(arrs);
        System.out.println(st1.distinct().distinct().collect(Collectors.toList()));
        st1 = Arrays.stream(arrs);
        st1.mapToInt(String::length).forEach(System.out::println);
        st1 = Arrays.stream(arrs);
        st1.flatMapToInt(String::chars).forEach(System.out::println);
        st1 = Arrays.stream(arrs);
        st1.peek(c -> System.out.println("!! " + c)).forEach(s -> {
        });
        st1 = Arrays.stream(arrs);
        st1.limit(3).forEach(System.out::println);
        st1 = Arrays.stream(arrs);
        st1.sorted().forEach(System.out::println);
        st1 = Arrays.stream(arrs);
        System.out.println(st1.anyMatch("ab"::equals));
        st1 = Arrays.stream(arrs);
        System.out.println(st1.allMatch(s -> s.contains("a")));
        String s = "и\u0306";
        System.out.println(s);
        System.out.println(isPalindrome(s));
        System.out.println(s.length());
    }

    public static boolean isPalindrome(String s) {
        StringBuilder ltr = new StringBuilder();
        s.chars().filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .forEach(ltr::appendCodePoint);
        StringBuilder rtl = new StringBuilder(ltr).reverse();
        return ltr.toString().equals(rtl.toString());

    }
}
