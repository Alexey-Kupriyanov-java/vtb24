package Lesson4;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "E", "F"};

        // Test swapElements method
        printArray(array);
        swapElements(array, 2, 5);
        printArray(array);

        // Test toArrayList method
        ArrayList<String> arrayList = toArraList(array);
        System.out.println(arrayList);

        // Test Box class (generic)
        Apple apple1 = new Apple(1);
        Apple apple2 = new Apple(1);
        Apple apple3 = new Apple(1);

        Orange orange1 = new Orange(1.5f);
        Orange orange2 = new Orange(1.5f);

        Box<Apple> box1 = new Box<>();
        box1.addFruit(apple1);
        box1.addFruit(apple2);
        box1.addFruit(apple3);
        System.out.println(box1);

        Box<Orange> box2 = new Box<>();
        box2.addFruit(orange1);
        box2.addFruit(orange2);
        System.out.println(box2);

        System.out.println("Are the boxes equal? : " + box1.compareTo(box2));

        Box<Orange> box3 = new Box<>();
        box2.pour(box3);
        System.out.println(box3);
    }

    private static void printArray(String[] array) {
        for (String string :
                array) {
            System.out.print(string + " ");
        }
        System.out.println();
    }

    private static <T> ArrayList<T> toArraList(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }

    private static void swapElements(Object[] array, int first, int second) {
        Object temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
