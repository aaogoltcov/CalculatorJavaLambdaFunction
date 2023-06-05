import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        BinaryOperator<Integer> plus = (x, y) -> x + y;
        BinaryOperator<Integer> minus = (x, y) -> x - y;
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        BinaryOperator<Integer> divide = (x, y) -> {
            if (y == 0) {
                throw new NullPointerException("Деление на нуль!");
            }

            return x / y;
        };

        UnaryOperator<Integer> pow = x -> x * x;
        UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

        Predicate<Integer> isPositive = x -> x > 0;

        Consumer<Integer> println = System.out::println;

        // такая реализация не работает, т.к. calc не предоставляет
        // методы plus, minus, divide
        // int a = calc.plus.apply(1, 2);
        // int b = calc.minus.apply(1,1);
        // int c = calc.divide.apply(a, b);

        // рабочий вариант
        int a = plus.apply(1, 2);
        int b = minus.apply(1, 1);
        int c = divide.apply(a, b);


        // calc не предоставляет метод println
        // calc.println.accept(c);

        // рабочий вариант
        println.accept(c);
    }
}