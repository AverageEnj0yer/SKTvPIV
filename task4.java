import java.util.Arrays;
import java.util.Scanner;

public class task4 {
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
        System.out.print("Введите строку, чтобы проверить является ли она палиндромом: ");
        String a = scan.nextLine();
        StringBuffer buf = new StringBuffer(a);
        buf.reverse();
        String b = buf.toString();
        if (a.equals(b)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }

    }

    public static void task2(Scanner scan) {
        System.out.print("Введите строку из которой необходимо убрать повторяющиеся буквы: ");
        String a = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        a.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.println(sb);
    }

    public static void task3(Scanner scan) {
        System.out.print("Введите 2 строки, чтобы узнать являются ли они аннаграммами (через Enter): ");
        String a = scan.nextLine();
        String b = scan.nextLine();
        char[] arr = a.toCharArray();
        char[] brr = b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        if (Arrays.equals(arr, brr)){
            System.out.println("Строки - анаграммы");
        }
        else System.out.println("Строки - не анаграммы");

    }

    public static void task4(Scanner scan) {
        System.out.print("Введите 2 строки, чтобы провести лексикографическое сравнение (через Enter): ");
        String a = scan.nextLine();
        String b = scan.nextLine();
        if (a.compareToIgnoreCase(b) < 0)
            System.out.println("Первая строка лексиграфически первая :)");
        else if (a.compareToIgnoreCase(b) > 0)
            System.out.println("Вторая строка лексиграфически первая :)");
        else System.out.println("Строки лексиграфически эквивалентны");
    }

    public static void task5(Scanner scan) {
        System.out.print("Введите 2 строки, чтобы провести лексикографическое сравнение (через Enter): ");
        String a = scan.nextLine();
        String b = scan.nextLine();
        if (a.compareTo(b) < 0)
            System.out.println("Первая строка лексиграфически первая :)");
        else if (a.compareTo(b) > 0)
            System.out.println("Вторая строка лексиграфически первая :)");
        else System.out.println("Строки лексиграфически эквивалентны");
    }

    public static void task6(Scanner scan) {
        System.out.print("Введите 2 строки для объединения в одну (через Enter): ");
        String a = scan.nextLine();
        String b = scan.nextLine();
        StringBuffer buf = new StringBuffer(a);
        buf.append(b);
        System.out.println(buf);

    }

    public static void task7(Scanner scan) {
        System.out.print("Введите строку: ");
        String a = scan.nextLine();
        String b = "";
        System.out.println("Введите количество вводимых символов: ");
        int n = scan.nextInt();
        System.out.println("Введите символы: ");
        for (int i = 0; i <= n; i++) {
            b += scan.nextLine();
        }
        if (a.equals(b)) System.out.println("Строка равна указанной последовательности");
        else System.out.println("Строка не равна указанной последовательности");
    }

    public static void task8(Scanner scan) {
        System.out.print("Введите 2 строки, чтобы узнать кончавется ли первая строка второй: ");
        String a = scan.nextLine();
        String b = scan.nextLine();
        int count = 0;
        char[] arr = a.toCharArray();
        char[] brr = b.toCharArray();
        for (int i = arr.length - brr.length; i < arr.length; i++) {
            if (arr[i] == brr[i - (arr.length - brr.length)]){
                count++;
            }
        }
        if (count == brr.length){
            System.out.println("Да");
        }
        else System.out.println("Нет");

    }

    public static void task9(Scanner scan) {
        System.out.print("Введите 2 строки, чтобы узнать равняется ли один объект второму: ");
        String a = new String();
        a = scan.nextLine();
        String b = new String();
        b = scan.nextLine();
        if (a.equals(b)) System.out.println("Да");
        else System.out.println("Нет");
    }

    public static void task10(Scanner scan) {
        System.out.println("Введите строку, чтобы узнать ее длину: ");
        String a = scan.nextLine();
        System.out.println("Длина строки - " + a.length());
    }

}

