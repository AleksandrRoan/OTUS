package testing;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestElements {
    private static final String first = "Как это называется, когда экземпляр класса " +
            "также является экземпляром суперкласса?";
    private static final String second = "Какой из этих методов можно использовать, чтобы основной поток " +
            "выполнялся последним среди всех потоков?";
    private static final String third = "Что из нижеперечисленного является допустимой декларацией?";
    private static final String fourth = """
            Что выведет следующий код:
            int a = 028;
            System.out.println(a);""";
    private static final String[] answerOptions1 = {"Наследование", "Инкапсуляция", "Полиморфизм", "Абстракция"};
    private static final String[] answerOptions2 = {"call()", "sleep()", "join()", "stop()"};
    private static final String[] answerOptions4 = {"Error", "0.28", "028", "28"};
    private static final String[] answerOptions3 = {"int x = (double) 43.6;", "int x = 54.4;",
                                                    "int x = (int) 45.9;", "int x; x = 43.6;"};
    private static final String correctAnswer1 = "Полиморфизм";
    private static final String correctAnswer2 = "sleep()";
    private static final String correctAnswer3 = "int x = (int) 45.9;";
    private static final String correctAnswer4 = "Error";
    private static int correctCount = 0;
    private static int wrongCount = 0;

    public static void main(String[] args) {
        Question question1 = new Question(first);
        Question question2 = new Question(second);
        Question question3 = new Question(third);
        Question question4 = new Question(fourth);
        List<String> answerOptionsList1 = new ArrayList<>(List.of(answerOptions1));
        List<String> answerOptionsList2 = new ArrayList<>(List.of(answerOptions2));
        List<String> answerOptionsList3 = new ArrayList<>(List.of(answerOptions3));
        List<String> answerOptionsList4 = new ArrayList<>(List.of(answerOptions4));

        TestElements.getTesting(question1, answerOptionsList1, correctAnswer1);
        TestElements.getTesting(question2, answerOptionsList2, correctAnswer2);
        TestElements.getTesting(question3, answerOptionsList3, correctAnswer3);
        TestElements.getTesting(question4, answerOptionsList4, correctAnswer4);

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }

    public static void getTesting(Question question, List<String> answerOptionsList, String correctAnswer) {
        boolean isException = true;
        System.out.println(getQuestion(question));
        getAnswerOptionsList(answerOptionsList);
        while(isException) {
            System.out.print("Ваш ответ: ");
            try {
                Scanner scanner = new Scanner(System.in);
                int answer = scanner.nextInt();
                if (getCorrectAnswer(correctAnswer).equals(answerOptionsList.get(answer - 1))) {
                    correctCount++;
                } else {
                    wrongCount++;
                }
                isException = false;
            } catch (Exception e) {
                System.out.println("Вы ввели неверные данные!");
            }
        }
    }

    public static Question getQuestion(Question question) {
        return question;
    }

    public static void getAnswerOptionsList(List <String> answerOptionsList) {
        for (int i = 1; i <= answerOptionsList.size(); i++) {
            System.out.println(i + ". " + answerOptionsList.get(i - 1));
        }
    }

    public static String getCorrectAnswer(String correctAnswer) {
        return correctAnswer;
    }
}
