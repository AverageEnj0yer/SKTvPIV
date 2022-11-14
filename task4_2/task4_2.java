package task4_2;

public class task4_2 {
    public static void main(String[] args) {
        String ob1 = "10", ob2 = "20", ob3 = "30", ob4 = "40";
        TypeCollection<String> type1 = new TypeCollection<>(ob1, ob2, ob3);
        System.out.println("Size: " + type1.size());
        System.out.println("Get object with index 1 : " + type1.get(1));
        type1.add(ob4);
        System.out.println("Added one more object, actual size: " + type1.size());
        type1.remove(3);
        System.out.println("Removed object with index 2, actual size: " + type1.size());
        type1.remove(ob3);
        System.out.println("Removed object3, actual size: " + type1.size());
        type1.clear();
        System.out.println("Clear. Size: " + type1.size());
    }
}
