package Task19;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Integer> supplier =()->(int) (Math.random()*10);

        System.out.println(supplier.get());
    }
}
