package fourteen;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = s->!s.isEmpty();

        System.out.println(predicate.test(""));
        System.out.println(predicate.test("DSSDS"));
    }
}
