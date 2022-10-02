package task2_2;

public class Horse extends Animal {
    String height;

    public Horse(String food, String location) {
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("И-го-го");
    }
    public void eat(){
        System.out.println("Лошадь ест " + food);
    }
}
