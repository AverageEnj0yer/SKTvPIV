import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        String task = scan.nextLine();
        switch (task) {
            case "1":
                task1(scan);
                break;
            case "2":
                task2(scan);
                break;
            case "3":
                task3(scan);
                break;
            case "4":
                task4(scan);
                break;
            case "5":
                task5(scan);
                break;
            case "6":
                task6(scan);
                break;
            case "7":
                task7(scan);
                break;
            case "8":
                task8(scan);
                break;
            case "9":
                task9(scan);
                break;
            case "10":
                task10(scan);
                break;
        }
        scan.close();
    }

    public static void task1(Scanner scan) {
        System.out.print("Введите строку, чтобы преобразовать все символы строки в нижний регистр: ");
        String a = scan.nextLine();
        System.out.println("Строка - " + a.toLowerCase());

    }

    public static void task2(Scanner scan) {
        System.out.print("Введите строку, чтобы преобразовать все символы строки в верхний регистр: ");
        String a = scan.nextLine();
        System.out.println("Строка - " + a.toUpperCase());
    }

    public static void task3(Scanner scan) {
        System.out.print("Введите строку, чтобы найти второй по частоте символ в данной строке: ");
        String a = scan.nextLine();
        char[] arr = a.toCharArray();
        Arrays.sort(arr);
        int count = 0, max = 0, max2 = 0;
        char maxch = 0, maxch2 = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr [i]) count++;
            else {
                count++;
                if (max < count) {
                    max2 = max;
                    maxch2 = maxch;
                    max = count;
                    maxch = arr[i];
                }
                if (max > count && max2 < count){
                    max2 = count;
                    maxch2 = arr[i];
                }
                count = 0;
            }
        }
        count++;
        if (max < count) {
            max2 = max;
            maxch2 = maxch;
            max = count;
            maxch = arr[arr.length-1];
        }
        System.out.println("Символ <" + maxch2 + "> встречается " + max2 + " раз. Он второй по частоте.");
    }

    public static void task4(Scanner scan) {
        System.out.print("Введите строку из которой необходимо убрать повторяющиеся буквы: ");
        String a = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        a.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.println(sb);
    }

    public static void task5(Scanner scan) {
        System.out.print("Введите строку, чтобы найти первый неповторяющийся символ в данной строке: ");
        String a = scan.nextLine();
        char[] arr = a.toCharArray();
        char edin = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i] && arr[i-1] != arr[i]) {
                edin = arr[i];
                break;
            }
        }
        System.out.println("Первый неповторяющийся символ - " + edin);
    }

    public static void task6(Scanner scan) {
        System.out.print("Введите строку: ");
        String a = scan.nextLine();
        char[] arr = a.toCharArray();
        if (arr[0] == arr[arr.length-2] && arr[1] == arr[arr.length-1])
            System.out.println("Первые 2 символа равны последним двум");
        else System.out.println("Первые 2 символа не равны последним двум");
    }

    public static void task7(Scanner scan) {
        System.out.print("Введите строку, чтобы найти количество символов, появляющихся 3 раза в данной строке: ");
        String a = scan.nextLine();
        char[] arr = a.toCharArray();
        Arrays.sort(arr);
        int count = 0, kolvo = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr [i]) count++;
            else {
                count++;
                if (count == 3) kolvo++;
                count = 0;
            }
        }
        count++;
        if (count == 3) kolvo++;
        System.out.println("Количество символов - " + kolvo);
    }

    public static void task8(Scanner scan) {
        System.out.print("Введите строку, чтобы получить сумму цифр в ней: ");
        String a = scan.nextLine();
        char[] arr = a.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) sum += arr[i] - '0';
        }
        System.out.println("Сумма цифр - " + sum);
    }

    public static void task9(Scanner scan) {
    }

    public static void task10(Scanner scan) {
    }

}


