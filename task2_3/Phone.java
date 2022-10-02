package task2_3;

public class Phone {
    int number, weight;
    String model;
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
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
        System.out.println("Звонит " + name + ", номер " + number);
    }
    public void sendMessage (int ... var){
        System.out.println("Сообщение будет отправлено на номера:");
        for (int i = 0; i < var.length - 1; i++) {
            System.out.print(var[i] + ",");
        }
        System.out.print(var[var.length-1]);

    }
}
