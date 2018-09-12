public class OperatorExpression extends Expression {
    public OperatorExpression(Expression expression) {
        super(expression);
    }

    @Override
    public String interpret(String context) {
        String result = "";
        switch (context) {
            case "plus":
                result = "+";
            break;

            case "minus":
                result = "-";
            break;

            default:
                if (expression != null)
                    result = expression.interpret(context);
        }

        return result;
    }
}