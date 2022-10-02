package task2_1;

public class task2_1 {
    public static void main(String[] args) {
        Student student = new Student("Anna", "Soz", "BAP1901", 5);
        Aspirant aspirant = new Aspirant("David", "Sad", "SadBoys", 5);
        Student student1 = aspirant;
        Student student2 = new Student("","","", 4);
        Aspirant aspirant1 = new Aspirant("","","", 4);

        Student[] students = new Student[5];
        students[0] = student;
        students[1] = aspirant;
        students[2] = student1;
        students[3] = student2;
        students[4] = aspirant1;

        for (int i = 0; i < 5; i++) {
            students[i].getScolarship();
        }
    }
}
