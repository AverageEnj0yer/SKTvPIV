package task3;

public abstract class Car {
    String brand, type, weight;
    Engine engine;
    public abstract void start ();
    public abstract void stop ();
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }
    public abstract void printInfo ();

}
