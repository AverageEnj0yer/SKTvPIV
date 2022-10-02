package task2_2;

public class Vet {
    public static void treatAnimal(Animal animal){
        animal.eat();
        System.out.println("Животное находится " + animal.location);
    }
}
