package task2_2;

public class Animal {
    String food, location;
    public Animal (String food, String location){
        this.food = food;
        this.location = location;
    }
    public void makeNoise(){
        System.out.println("Животное спит");
    }
    public void eat(){
        System.out.println("Животное ест");
    }
    public void sleep(){

    }
}
