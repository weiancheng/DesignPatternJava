public abstract class Expression {
    protected Expression expression;

    public Expression(Expression expression) {
        this.expression = expression;
    }

    public abstract String interpret(String context);
}