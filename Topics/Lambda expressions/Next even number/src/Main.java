import java.util.function.LongUnaryOperator;

class Operator {

    public static LongUnaryOperator unaryOperator = x -> {
        x++;

        while (x % 2 != 0d) {
            x++;
        }
        return x;
    };
}