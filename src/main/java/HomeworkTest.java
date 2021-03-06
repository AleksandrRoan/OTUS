import java.util.Scanner;

public class HomeworkTest {
    public static void main(String[] args) {

        String firstQuestion = "Как это называется, когда экземпляр класса также является экземпляром суперкласса?";
        String secondQuestion = "Какой из этих методов можно использовать, чтобы основной поток " +
                "выполнялся последним среди всех потоков?";
        String thirdQuestion = "Что из нижеперечисленного является допустимой декларацией?";
        String fourthQuestion = """
                Что выведет следующий код:
                int a = 028;
                System.out.println(a);""";

        int correctCount = 0, wrongCount = 0;

        String[] questions = {firstQuestion, secondQuestion, thirdQuestion, fourthQuestion};

        String[][] answerOptions = {{"1. Наследование", "2. Инкапсуляция", "3. Полиморфизм", "4. Абстракция"},
                {"1. call()", "2. sleep()", "3. join()", "4. stop()"},
                {"1. int x = (double) 43.6;", "2. int x = (int) 54.4;", "3. int x = (int) 45.9;", "4. int x; x = 43.6;"},
                {"1. Error", "2. 0.28", "3. 028", "4. 28"}};

        int[] correctAnswers = {3, 2, 3, 1};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            for (int j = 0; j < answerOptions.length; j++) {
                System.out.println(answerOptions[i][j]);
            }

            System.out.print("Ваш ответ: ");

            int answer = scanner.nextInt();

            if (answer == correctAnswers[i]) {
                correctCount++;
            } else {
                wrongCount++;
            }

            System.out.println();
        }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
