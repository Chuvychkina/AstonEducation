package org.example;

public class ArithmeticOperations {
    public static double performOperation(int a, int b, char operation) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                    return Double.NaN; // Возвращаем NaN при ошибке
                }
                return (double) a / b;
            default:
                System.out.println("Неверная операция. Используйте +, -, * или /.");
                return Double.NaN;
        }
    }
}
