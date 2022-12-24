package task6;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String login, password;
        int flag = 0;
        String[][] baza = {
                {"admin", "admin"},
                {"user1", "123456"},
                {"user2", "1234"}
        };
        String[][] other = {
                {"наушники", "10"},
                {"таблетки", "7"},
                {"проездной", "9"}
        };
        String[][] animals = {
                {"кошка", "8"},
                {"собака", "7"},
                {"попугай", "10"}
        };
        String[] korzina = new String[1];

        //авторизация
        System.out.println("Связки логинов и паролей: ");
        for (int i = 0; i < baza.length; i++) {
            for (int j = 0; j < baza[i].length; j++) {
                System.out.print(baza[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Введите логин и пароль через Enter: ");
        Scanner scan = new Scanner(System.in);
        login = scan.nextLine();
        password = scan.nextLine();

        for (int i = 0; i < baza.length; i++) {
            flag = 0;
            if (login.equals(baza[i][0]) && password.equals(baza[i][1])) flag++;
            if (flag == 1) {
                Users user = new Users(login, password);
                System.out.println("Авторизация пройдена, вы вошли в аккаунт");
                break;
            }
        }

        if (flag == 0) {
            Users user = new Users("", "");
            System.out.println("Вы вошли под новым пользователем");
        }

        //просмотр каталогов
        System.out.println("Какой каталог вас интересует? У нас представлены каталоги \"животные\" и \"другое\". Введите 1 или 2: ");
        int catalog = scan.nextInt();
        System.out.println("Отсортировать ассортимент по количеству или по алфавиту? Введите 1 или 2: ");
        int sort = scan.nextInt();

        //создаем массив для текущего каталога
        int a, b;
        if (animals.length > other.length) {
            a = animals.length;
            b = animals[0].length;
        } else {
            a = other.length;
            b = other[0].length;
        }
        String[][] temp = new String[a][b];

        if (catalog == 1) {
            String[] temp_s = new String[animals.length];

            if (sort == 1) {
                temp = intSort(animals, 1);

                for (int i = 0; i < animals.length; i++) {
                    for (int j = 0; j < animals[i].length; j++) {
                        System.out.print(animals[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            if (sort == 2) {
                for (int i = 0; i < animals.length; i++) {
                    temp_s[i] = animals[i][0];
                }
                Arrays.sort(temp_s);

                for (int i = 0; i < temp_s.length; i++) {
                    for (int j = 0; j < animals.length; j++) {
                        if (animals[j][0].equals(temp_s[i])) {
                            temp[i][0] = animals[j][0];
                            temp[i][1] = animals[j][1];
                        }
                    }
                }
                //animals = temp;

                for (int i = 0; i < temp.length; i++) {
                    for (int j = 0; j < temp[i].length; j++) {
                        System.out.print(temp[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }

        if (catalog == 2) {
            //String[][] temp = new String[other.length][other[0].length];
            String[] temp_s = new String[other.length];

            if (sort == 1) {
                temp = intSort(other, 1);

                for (int i = 0; i < temp.length; i++) {
                    for (int j = 0; j < temp[i].length; j++) {
                        System.out.print(temp[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            if (sort == 2) {
                for (int i = 0; i < other.length; i++) {
                    temp_s[i] = other[i][0];
                }
                Arrays.sort(temp_s);
                for (int i = 0; i < temp_s.length; i++) {
                    for (int j = 0; j < other.length; j++) {
                        if (other[j][0].equals(temp_s[i])) {
                            temp[i][0] = other[j][0];
                            temp[i][1] = other[j][1];
                        }
                    }
                }
                //other = temp;
                for (int i = 0; i < temp.length; i++) {
                    for (int j = 0; j < temp[i].length; j++) {
                        System.out.print(temp[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }

        //корзина
        System.out.println("Что бы вы хотели приобрести? (1, 2 ,3 )");
        int nomer = scan.nextInt();
        if (nomer == 1) {
            korzina[0] = temp[0][0];
        }
        if (nomer == 2) {
            korzina[0] = temp[1][0];
        }
        if (nomer == 3) {
            korzina[0] = temp[2][0];
        }
        System.out.println("Товар добавлен в вашу корзину. Корзина: ");
        System.out.println(korzina[0]);

        //покупка
        System.out.println("Оформляем покупку? (1 - да, 2 - нет)");
        nomer = scan.nextInt();
        if (nomer == 1) {
            System.out.println("Покупка совершена. Спасибо. ");
        }
        if (nomer == 2) {
            System.out.println("Ну не очень-то и хотелось :<");
        }

        //запись корзины в файл
        try {
            PrintWriter pw = new PrintWriter("test.txt");
            pw.println("Последняя корзина: ");
            pw.println(korzina[0]);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        try {
            FileOutputStream os = new FileOutputStream("serDeser.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
            // сохраняем в файл
            objectOutputStream.writeObject((String) korzina[0]);
            //закрываем поток и освобождаем ресурсы
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //десериализация
        try {
            FileInputStream fs = new FileInputStream("serDeser.txt");
            ObjectInputStream ois = new ObjectInputStream(fs);
            System.out.println("Десериализованная информация: " + ois.readObject());
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String[][] intSort(String[][] array, int column) {
        String[] temp = new String[array[0].length];
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < temp.length - 1; i++) {
                if (Integer.parseInt(array[i][column]) > Integer.parseInt(array[i + 1][column])) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    changed = true;
                }
            }
        }
        return array;
    }
}
