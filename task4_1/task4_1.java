package task4_1;
import java.util.*;

public class task4_1 {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        System.out.println("В коробке 3 яблока, вес коробки " + box1.getWeight());

        box1.add(apple4);
        System.out.println("Добавили в коробку еще одно яблоко, вес коробки " + box1.getWeight());

        Box<Orange> box2 = new Box<Orange>(orange1, orange2);
        System.out.println("В коробке 2 апельсина, вес коробки " +box2.getWeight());

        box1.compare(box2);

        Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);
        System.out.println("Пересыпали апельсины в другую коробку, вес первой коробки " + box2.getWeight() + ", вес второй коробки " + box3.getWeight());
    }
}