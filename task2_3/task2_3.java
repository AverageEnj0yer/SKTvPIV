package task2_3;

public class task2_3 {
    public static void main(String[] args) {
        Phone phone = new Phone (7909,200, "S10");
        Phone phone1 = new Phone (7909,"S10");
        Phone phone2 = new Phone ();
        phone.receiveCall("Anna");
        phone.getNumber();
        phone.receiveCall("Bob", 7908);
        phone2.sendMessage(79045,4567,1234,56789,8906);
    }
}
