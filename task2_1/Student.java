package task2_1;

public class Student {
    String firstName, lastName, group;
    double averageMark;
    public Student(String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public void getScolarship()
    {
        if (this.averageMark == 5) {
            System.out.println("Сумма стипендии " + 100);
        }
        else System.out.println("Сумма стипендии " + 80);
    }
}
