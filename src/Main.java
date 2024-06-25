import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Выберите задачу: \n1. Сравнение чисел. \n2. Сравнение строк. \n3. Четные числа. \nВведите номер задачи: ");
        int num = in.nextInt();

        switch (num) {
            case 1: compare_numbers();
            case 2: compare_strings();
            case 3: even_numbers();
        }
    }

    static void compare_numbers() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = in.nextInt();

        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        if (a == b) {
            System.out.println("a = b");
        } else {
            if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a > b");
            }
        }

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        in.close();
    }

    static void compare_strings() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String a = in.nextLine();

        System.out.print("Введите вторую строку: ");
        String b = in.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        in.close();
    }

    static void even_numbers() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int j : arr) {
            if (j % 2 == 0) System.out.println(j);
        }
    }
}