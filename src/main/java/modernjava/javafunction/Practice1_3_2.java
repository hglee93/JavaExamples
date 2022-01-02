package modernjava.javafunction;

import java.util.ArrayList;
import java.util.List;

import static modernjava.javafunction.Color.GREEN;

public class Practice1_3_2 {
    public static void main(String[] args) {
        List<Apple> apples = initApples();

        List<Apple> result = filterGreenApples(apples);
        for(Apple apple : result) {
            System.out.println(apple.getName() + " : " + apple.getColor().getColor());
        }

        System.out.println();

        List<Apple> result2 = filterHeavyApples(apples);
        for(Apple apple : result2) {
            System.out.println(apple.getName() + " : " + apple.getColor().getColor());
        }
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

    /**
     * 색상으로 필터링 하는 함수 구현(기존의 방법)
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        } return result;
    }

    /**
     * 무게가 150 이상인 사과를 필터링 하는 함수 구현
     */
    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 150) {
                result.add(apple);
            }
        } return result;
    }

}

enum Color {

    GREEN("Green"), RED("Red");

    final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
};

class Apple {

    private Color color;

    private String name;

    private int weight;

    public Apple(Color color, String name, int weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    /**
     * Java8 Predict 메서드 추가
     */
    public static boolean isGreenApple(Apple apple) {
        return GREEN.equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }
}
