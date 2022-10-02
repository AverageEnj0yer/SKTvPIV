package task2_2;

public class Dog extends Animal {
    String colour;

    public Dog(String food, String location) {
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("Гав");
    }
    public void eat(){
        System.out.println("Собака ест " + this.food);
    }
}
