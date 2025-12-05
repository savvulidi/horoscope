import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите вашу дату рождения (день и месяц):");
        int day = input.nextInt();
        int month = input.nextInt();

        Date birthday = new Date(day, month);

        System.out.println(birthday.getFortune());
    }
}
