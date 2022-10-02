package task2_1;

public class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }
    public void getScolarship()
    {
        if (this.averageMark == 5) {
            System.out.println("Сумма стипендии " + 200);
        }
        else System.out.println("Сумма стипендии " + 180);
    }
}
