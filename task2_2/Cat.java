package task2_2;

public class Cat extends Animal {
    String size;

    public Cat(String food, String location) {
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("���");
    }
    public void eat(){
        System.out.println("��� ��� " + food);
    }
}
