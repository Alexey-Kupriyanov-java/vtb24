package Lesson4;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> box;
    private float weight;

    public Box() {
        this.box = new ArrayList<>();
        weight = 0;
    }

    public void addFruit(T fruit) {
        box.add(fruit);
        weight += fruit.getWeight();
    }

    public void removeFruit(T fruit) {
        if (box.remove(fruit)) {
            weight -= fruit.getWeight();
        }
    }

    public float getWeight() {
        return weight;
    }

    public boolean compareTo(Box<?> box) {
        if (Math.abs(getWeight() - box.getWeight()) < 0.0001) {
            return true;
        }
        return false;
    }

    public void pour(Box<T> box) {
        if (this == box) {
            return;
        }
        for (int i = 0; i < this.box.size();) {
            box.addFruit(this.box.remove(i));
        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "box=" + box +
                ", weight=" + weight +
                '}';
    }
}
