import java.util.Scanner;

public class Work {
    public static void main(String[] args) {






        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте! Введите первое число:");
        double firstValue = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double secondValue = scanner.nextDouble();
        System.out.println("Выберите нужную вам операцию: \n1.Сложение \n2.Вычитание \n3.Умножение \n4.Деление");
        int operation = scanner.nextInt();
        switch (operation) {


            case 1:
                System.out.println("Результат сложения чисел: " + addition (secondValue, firstValue));
                break;
            case 2:
                System.out.println("Результат вычитания чисел: " + subtraction (secondValue, firstValue));
                break;
            case 3:
                System.out.println("Результат умножения чисел: " + multiplication (secondValue, firstValue));
                break;
            case 4:
                System.out.println("Результат деления чисел: " + division (secondValue, firstValue));
                break;

        }

    }

    public static double addition (double value1, double value2){

        return value1 + value2;
    }

    public static double subtraction (double value1, double value2){

        return value1 - value2;
    }

    public static double multiplication (double value1, double value2){

        return value1 * value2;
    }

    public static double division (double value1, double value2){

        return value1 / value2;
    }
}