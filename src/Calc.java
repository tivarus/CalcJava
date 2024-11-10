import java.util.Scanner;

public class Calc {
    public static void count() {
        double firstNum = inputFirstNum();

        while (true) {
            System.out.print("Введите операцию, символ сброса (С) или символ выхода (S):");
            String operation = inputOperation();
            firstNum = solve(firstNum, operation);
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
                        return inputFirstNum();
                    case "S":
                        System.out.println("Выход из программы..");
                        System.exit(0);
                    default:
                        System.out.println("Неизвестная операция, сброс");
                        return inputFirstNum();
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
                        return Double.NaN;
                    case "S":
                        System.out.println("Выход из программы..");
                        System.exit(0);
                    default:
                        System.out.println("Неизвестная операция, сброс");
                        return Double.NaN;
                }
            }
        }
    }

    private static String inputOperation() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static double math(double firstNum, double secondNum, String operation) {
        switch (operation) {
            case "+":
                return firstNum + secondNum;
            case "-":
                return firstNum - secondNum;
            case "*":
                return firstNum * secondNum;
            case "/":
                if (secondNum != 0) {
                    return firstNum / secondNum;
                } else {
                    System.out.println("Делить на ноль нельзя, калькуль не умеет в высшую математику, пока..");
                    System.out.println("Сброс");
                    return inputFirstNum();
                }
        }
        return firstNum;
    }

    private static double solve(double firstNum, String operation) {
        switch (operation.toUpperCase()) {
            case "+":
            case "-":
            case "*":
            case "/":
                double secondNum = inputSecondNum();
                if (Double.isNaN(secondNum)) {
                    firstNum = inputFirstNum();
                    break;
                }
                firstNum = math(firstNum, secondNum, operation);
                break;
            case "=":
                System.out.println("Ответ:" + firstNum);
                break;
            case "C":
                System.out.println("Сброс");
                firstNum = inputFirstNum();
                break;
            case "S":
                System.out.println("Выход из программы..");
                System.exit(0);
            default:
                System.out.println("Неизвестная операция, сброс");
                firstNum = inputFirstNum();
                break;
        }
        return firstNum;
    }
}
