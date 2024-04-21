import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String riddle = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        System.out.println("Отгадайте загадку: " + riddle);
        System.out.println("Вы имеете право на подсказку при первой попытке, для этого введите строку \"Подсказка\"");
        String answer = "Заархивированный вирус";
        String hint = "Опасный код в архиве из двух слов";
        String hintRefuse = "Подсказка уже недоступна";
        boolean hintUsed = false;
        String right = "Правильно!";
        String wrong = "Подумай еще!";
        String lastWrong = "Обидно, приходи в другой раз";
        for (int i = 1; i <= 3; i++) {
            System.out.print("Попытка " + i + ": ");
            String currentLine = console.nextLine();
            while (currentLine.equalsIgnoreCase("Подсказка")) {
                System.out.println(((i == 1) && !hintUsed) ? hint : hintRefuse);
                hintUsed = true;
                System.out.print("Попытка " + i + ": ");
                currentLine = console.nextLine();
            }
            if (hintUsed) i = 3;
            if (currentLine.equalsIgnoreCase(answer)) {
                System.out.println(right);
                break;
            } else {
                System.out.println((i == 3) ? lastWrong : wrong);
            }
        }
    }
}