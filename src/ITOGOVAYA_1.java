import java.util.Arrays;
import java.util.Scanner;

public class ITOGOVAYA_1 {
    public static void main(String[] args) {
        //Ввести с консоли число в бинарном формате.
        // Перевести его в десятичный формат, записать в переменную int и вывести на экран.
        // Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.

        Scanner scan = new Scanner(System.in);
        System.out.println("Число в бинарном формате (от 1 до 31 нулей/единиц) =");
        String chislo = scan.next();
        char[] chisloToCharArray = chislo.toCharArray();

        int chisloToInt = 0;
        for (int i = chisloToCharArray.length - 1; i >= 0; i--) {
            chisloToInt += (chisloToCharArray[i] - 48) * Math.pow(2, chisloToCharArray.length - i - 1);
        }
        System.out.println(chisloToInt);

        scan.close();
    }
}
