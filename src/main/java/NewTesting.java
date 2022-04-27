import java.util.Scanner;

public class NewTesting {
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

        Object[][][] questionsAll = {{{firstQuestion}, {"1. Наследование", "2. Инкапсуляция", "3. Полиморфизм", "4. Абстракция"}, {3}},
                {{secondQuestion}, {"1. call()", "2. sleep()", "3. join()", "4. stop()"}, {2}},
                {{thirdQuestion}, {"1. int x = (double) 43.6;", "2. int x = (int) 54.4;", "3. int x = (int) 45.9;", "4. int x; x = 43.6;"}, {3}},
                {{fourthQuestion}, {"1. Error", "2. 0.28", "3. 028", "4. 28"}, {1}}};

        int numberQuestion = 0;
        boolean isException = true;
        while (numberQuestion < questionsAll.length) {
            if (isException) {
                System.out.println(questionsAll[numberQuestion][0][0]);

                for (int i = 0; i < questionsAll[numberQuestion][1].length; i++) {
                    System.out.println(questionsAll[numberQuestion][1][i]);
                }
            }
                System.out.print("Ваш ответ: ");

                try {
                    Scanner scanner = new Scanner(System.in);
                    int answer = scanner.nextInt();
                    if (questionsAll[numberQuestion][2][0] instanceof Integer
                            && answer == (int) questionsAll[numberQuestion][2][0]) {
                        correctCount++;
                    } else {
                        wrongCount++;
                    }
                } catch (Exception e) {
                    System.out.println("Вы ввели неверные данные!");
                    isException = false;
                    continue;
                }
                System.out.println();
                numberQuestion++;
                isException = true;
            }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}