package org.pdas.utils.testMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class SimplePlayground {
    public static void main(String[] args) {
        String s1 = "100";
        Integer number = 100;
        String s2 = number.toString();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("Charlie", 800);
        System.out.println(mapping.toString());

        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x*y;
        Function<Integer, Integer> twice = (x) -> 2*x;
        Integer prod = multiply.apply(30, 40);
        Integer twi = twice.apply(30);
        multiply.andThen(twice);
        System.out.println(prod);
    }
}
