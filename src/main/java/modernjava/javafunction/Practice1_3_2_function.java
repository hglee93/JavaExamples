package modernjava.javafunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static modernjava.javafunction.Color.GREEN;

public class Practice1_3_2_function {
    public static void main(String[] args) {
        List<Apple> apples = initApples();

        List<Apple> result = filterApples(apples, Apple::isGreenApple);
        print(result);

        result = filterApples(apples, Apple::isHeavyApple);
        print(result);
    }

    private static List<Apple> initApples() {
        List<Apple> apples = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            int weight = i * 30;
            String name = "applie" + i;

            if(i % 2 == 0) {
                apples.add(new Apple(Color.RED, name, weight));
            } else {
                apples.add(new Apple(GREEN, name, weight));
            }
        }

        return apples;
    }

    private static void print(List<Apple> result) {
        for(Apple apple : result) {
            System.out.println(apple.getName() + " : " + apple.getColor().getColor());
        }
        System.out.println();
    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}

