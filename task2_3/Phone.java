package task2_3;

public class Phone {
    int number, weight;
    String model;
    public void receiveCall(String name){
        System.out.println("������ " + name);
    }

    public int getNumber() {
        return number;
    }
    public Phone (int number, int weight, String model){
        this(number, model);
        this.weight = weight;

    }
    public Phone (int number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone (){
        this.weight = -1;
        this.number = -1;
        this.model = "Unknown";
    }
    public void receiveCall(String name, int number){
        System.out.println("������ " + name + ", ����� " + number);
    }
    public void sendMessage (int ... var){
        System.out.println("��������� ����� ���������� �� ������:");
        for (int i = 0; i < var.length - 1; i++) {
            System.out.print(var[i] + ",");
        }
        System.out.print(var[var.length-1]);

    }
}
