import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
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

    public static void task1(Scanner scan)
    {
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        System.out.println("Последняя цифра числа: " + number%10);
    }
    public static void task2(Scanner scan)
    {
        System.out.print("Введите трехзначное число: ");
        int number = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += number%10;
            number /= 10;
        }
        System.out.println("Сумма цифр числа: " + sum);
    }
    public static void task3(Scanner scan)
    {
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        if (number >= 0) number++;
        System.out.println("Преобразованное число: " + number);
    }
    public static void task4(Scanner scan)
    {
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        if (number > 0) number++;
        else if (number < 0) number -= 2;
        else number = 10;
        System.out.println("Преобразованное число: " + number);
    }
    public static void task5(Scanner scan)
    {
        System.out.println("Введите 3 числа через Enter: ");
        int min = scan.nextInt();
        for (int i = 0; i < 2; i++) {
            int number = scan.nextInt();
            if (number < min) min = number;
        }
        System.out.println("Наименьшее число: " + min);
    }
    public static void task6(Scanner scan)
    {
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        if ((number > 0) & (number%2 == 0)) System.out.println("Положительное четное число");
        else if ((number > 0) & (number%2 == 1)) System.out.println("Положительное нечетное число");
        else if ((number < 0) & (number%2 == 1)) System.out.println("Отрицательное нечетное число");
        else if ((number < 0) & (number%2 == 0)) System.out.println("Отрицательное четное число");
        else System.out.println("Нулевое число");
    }
    public static void task7(Scanner scan)
    {
        System.out.print("Введите код города (905, 194, 491, 800): ");
        int number = scan.nextInt();
        if (number == 905) System.out.println("Москва. Стоимость разговора: 41.5");
        else if (number == 194) System.out.println("Ростов. Стоимость разговора: 19.8");
        else if (number == 491) System.out.println("Краснодар. Стоимость разговора: 26.9");
        else if (number == 800) System.out.println("Киров. Стоимость разговора: 50.0");
        else System.out.println("Ошибка в номере города");
    }
    public static void task8(Scanner scan)
    {
        int[] array = new int[] {1, -10, 5, 6 ,45 ,23, 45, -34, 0, 32, 56, -1, 2, -2};
        int max = Integer.MIN_VALUE, sumOfPositive = 0, sumOfEvenNegative = 0, numberOfPositive = 0, averageOfNegative = 0, counterOfNegative = 0;
        System.out.print("Дан массив {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != (array.length - 1)) System.out.print(", ");
            if (array[i] > max) max = array[i];
            if (array[i] >= 0) {
                numberOfPositive++;
                sumOfPositive += array[i];
            }
            if (array[i] < 0) {
                averageOfNegative += array[i];
                counterOfNegative++;
                if (array[i]%2 == 0){
                    sumOfEvenNegative += array[i];
                }
            }
        }
        System.out.println("}");
        averageOfNegative = averageOfNegative / counterOfNegative;
        System.out.println("Максимальное число массива: " + max);
        System.out.println("Суума положительных чисел: " + sumOfPositive);
        System.out.println("Сумма четных отрицательных чисел: " + sumOfEvenNegative);
        System.out.println("Количество положительных чисел: " + numberOfPositive);
        System.out.println("Среднее арифметическое отрицательных чисел: " + averageOfNegative);
    }
    public static void task9(Scanner scan)
    {
        int[] array = new int[] {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};
        System.out.print("Начальный вид массива: {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != (array.length) - 1) System.out.print(", ");
            else System.out.println("}");
        }
        for(int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.print("Перевернутый массив: {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != (array.length) - 1) System.out.print(", ");
            else System.out.print("}");
        }
    }
    public static void task10(Scanner scan)
    {
        int[] array = new int[] {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
        System.out.print("Начальный вид массива: {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != (array.length) - 1) System.out.print(", ");
            else System.out.println("}");
        }
        int[] newArray = new int[14];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.print("Измененный массив: {");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i != (newArray.length) - 1) System.out.print(", ");
            else System.out.print("}");
        }
    }

}
