import java.util.Scanner;

public class Work {
    public static void main(String[] args) {






        Scanner scanner = new Scanner(System.in);
        System.out.println("������������! ������� ������ �����:");
        double firstValue = scanner.nextDouble();
        System.out.println("������� ������ �����:");
        double secondValue = scanner.nextDouble();
        System.out.println("�������� ������ ��� ��������: \n1.�������� \n2.��������� \n3.��������� \n4.�������");
        int operation = scanner.nextInt();
        switch (operation) {


            case 1:
                System.out.println("��������� �������� �����: " + addition (secondValue, firstValue));
                break;
            case 2:
                System.out.println("��������� ��������� �����: " + subtraction (secondValue, firstValue));
                break;
            case 3:
                System.out.println("��������� ��������� �����: " + multiplication (secondValue, firstValue));
                break;
            case 4:
                System.out.println("��������� ������� �����: " + division (secondValue, firstValue));
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