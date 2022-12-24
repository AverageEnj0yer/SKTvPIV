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
                {"��������", "10"},
                {"��������", "7"},
                {"���������", "9"}
        };
        String[][] animals = {
                {"�����", "8"},
                {"������", "7"},
                {"�������", "10"}
        };
        String[] korzina = new String[1];

        //�����������
        System.out.println("������ ������� � �������: ");
        for (int i = 0; i < baza.length; i++) {
            for (int j = 0; j < baza[i].length; j++) {
                System.out.print(baza[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("������� ����� � ������ ����� Enter: ");
        Scanner scan = new Scanner(System.in);
        login = scan.nextLine();
        password = scan.nextLine();

        for (int i = 0; i < baza.length; i++) {
            flag = 0;
            if (login.equals(baza[i][0]) && password.equals(baza[i][1])) flag++;
            if (flag == 1) {
                Users user = new Users(login, password);
                System.out.println("����������� ��������, �� ����� � �������");
                break;
            }
        }

        if (flag == 0) {
            Users user = new Users("", "");
            System.out.println("�� ����� ��� ����� �������������");
        }

        //�������� ���������
        System.out.println("����� ������� ��� ����������? � ��� ������������ �������� \"��������\" � \"������\". ������� 1 ��� 2: ");
        int catalog = scan.nextInt();
        System.out.println("������������� ����������� �� ���������� ��� �� ��������? ������� 1 ��� 2: ");
        int sort = scan.nextInt();

        //������� ������ ��� �������� ��������
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

        //�������
        System.out.println("��� �� �� ������ ����������? (1, 2 ,3 )");
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
        System.out.println("����� �������� � ���� �������. �������: ");
        System.out.println(korzina[0]);

        //�������
        System.out.println("��������� �������? (1 - ��, 2 - ���)");
        nomer = scan.nextInt();
        if (nomer == 1) {
            System.out.println("������� ���������. �������. ");
        }
        if (nomer == 2) {
            System.out.println("�� �� �����-�� � �������� :<");
        }

        //������ ������� � ����
        try {
            PrintWriter pw = new PrintWriter("test.txt");
            pw.println("��������� �������: ");
            pw.println(korzina[0]);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //������� 2 ������ ��� ������������ ������� � ���������� ��� � ����
        try {
            FileOutputStream os = new FileOutputStream("serDeser.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
            // ��������� � ����
            objectOutputStream.writeObject((String) korzina[0]);
            //��������� ����� � ����������� �������
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //��������������
        try {
            FileInputStream fs = new FileInputStream("serDeser.txt");
            ObjectInputStream ois = new ObjectInputStream(fs);
            System.out.println("����������������� ����������: " + ois.readObject());
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
