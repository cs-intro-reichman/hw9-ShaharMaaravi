public class Test {

    public static final TestHandler testHandler = new TestHandler();
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Test <Question Name/number>");
        } else {
            System.out.println(args[0]);
            System.out.println(java.util.Arrays.asList(TesterQuestionEnum.values()));
            TesterQuestionEnum question = TesterQuestionEnum.valueOf(args[0]);
            testHandler.questionDecider(question, args);
        }
    }
}
