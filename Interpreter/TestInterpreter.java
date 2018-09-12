public class TestInterpreter {
    public static void main(String[] args) {
        System.out.println("This is Interpreter Pattern");
        Expression number = new NumberExpression(null);
        Expression operator = new OperatorExpression(number);

        String test = "one plus three minus two";
        String [] exp = test.split(" ");
        String result = "";
        for (String e : exp) {
            result = operator.interpret(e) + " ";
            System.out.println(result);
        }
    }
}