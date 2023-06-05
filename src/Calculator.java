import java.util.function.Supplier;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
}
