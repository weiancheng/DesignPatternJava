public class NumberExpression extends Expression {
    public NumberExpression(Expression expression) {
        super(expression);
    }

    @Override
    public String interpret(String context) {
        String result = "";
        switch (context) {
            case "one":
                result = "1";
            break;

            case "two":
                result = "2";
            break;

            case "three":
                result = "3";
            break;

            default:
                if (expression != null)
                    result = expression.interpret(context);
        }

        return result;
    }
}