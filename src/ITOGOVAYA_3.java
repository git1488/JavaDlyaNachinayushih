import java.util.Scanner;

public class ITOGOVAYA_3 {
    public static void main(String[] args) {
        //Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
        // Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
        // (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
        Scanner scan = new Scanner(System.in);
        System.out.println("Курс: ");
        double rate = scan.nextDouble();
        System.out.println("Рублей: ");
        double rub = scan.nextDouble();
        System.out.printf("usd: %.2f", rub / rate);

        scan.close();
    }
}
