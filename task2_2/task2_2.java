package task2_2;

public class task2_2 {
    public static void main(String[] args) {
        Animal animal = new Cat("рыбу", "дома");
        Animal animal1 = new Dog("мясо", "в будке");
        Animal animal2 = new Horse("траву","на лугу");
        Animal animals[] = new Animal[] {animal,animal1,animal2};
        for (int i = 0; i < animals.length; i++) {
            Vet.treatAnimal( animals[i]);
        }
    }
}
