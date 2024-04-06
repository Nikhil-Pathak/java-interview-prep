package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class InbuiltFunctionalInterface {
    public static void main(String[] args) {
        Consumer<String> consumer = (str) -> System.out.println(str);
        BiConsumer<Integer,String> biConsumer = (num, str) -> IntStream.range(1,num).forEach(System.out::print);
    }
}
