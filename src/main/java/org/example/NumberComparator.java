public class NumberComparator {
    public static double performOperation(int a, int b, char operation) {
        return switch (operation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                    yield Double.NaN;
                }
                yield (double) a / b;
            }
            default -> {
                System.out.println("Неверная операция. Используйте +, -, * или /.");
                yield Double.NaN;
            }
        };
}}
