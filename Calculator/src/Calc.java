import java.util.Scanner;

public class Calc {
    public static void count() {
        double firstNum = inputFirstNum();
        double secondNum;

        while (true) {
            System.out.print("Введите операцию, символ сброса (С) или символ выхода (S):");
            String operation = inputOperation();

            switch (operation.toUpperCase()) {
                case "C":
                    System.out.println("Сброс");
                    firstNum = inputFirstNum();
                    break;
                case "S":
                    System.out.println("Выход из программы..");
                    System.exit(0);
            }

            switch (operation) {
                case "+":
                    firstNum += inputSecondNum();
                    break;
                case "-":
                    firstNum -= inputSecondNum();
                    break;
                case "*":
                    firstNum *= inputSecondNum();
                    break;
                case "/":
                    secondNum = inputSecondNum();
                    if (secondNum != 0) {
                        firstNum /= secondNum;
                    } else {
                        System.out.println("Делить на ноль нельзя, калькуль не умеет в высшую математику, пока..");
                        System.out.println("Сброс");
                        firstNum = inputFirstNum();
                    }
                    break;
                case "=":
                    System.out.println(firstNum);
                    break;
                default:
                    System.out.println("Неизвестная операция, сброс");
                    firstNum = inputFirstNum();
                    break;
            }
        }
    }

    private static double inputFirstNum() {
        System.out.print("Введите  число,   символ сброса (С) или символ выхода (S):");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                switch (scanner.next().toUpperCase()) {
                    case "C":
                        System.out.println("Сброс");
                        System.out.print("Введите  число,   символ сброса (С) или символ выхода (S):");
                        return inputFirstNum();
                    case "S":
                        System.out.println("Выход из программы..");
                        System.exit(0);
                    default:
                        System.out.println("Неизвестная операция, сброс");
                        System.out.print("Введите  число,   символ сброса (С) или символ выхода (S):");
                }
            }
        }
    }

    private static double inputSecondNum() {
        System.out.print("Введите  число,   символ сброса (С) или символ выхода (S):");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                switch (scanner.next().toUpperCase()) {
                    case "C":
                        System.out.println("Сброс");
                        System.out.print("Введите  число,   символ сброса (С) или символ выхода (S):");
                        return inputFirstNum();
                    case "S":
                        System.out.println("Выход из программы..");
                        System.exit(0);
                    default:
                        System.out.println("Неизвестная операция, сброс");
                        System.out.print("Введите  число,   символ сброса (С) или символ выхода (S):");
                }
            }
        }
    }

    private static String inputOperation() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}

