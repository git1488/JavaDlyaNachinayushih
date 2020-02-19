import java.util.Scanner;

public class number_11 {
    public static void main(String[] args) {
        //Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную.
        // Результат вывести на экран.
        Scanner scan = new Scanner(System.in);
        System.out.println("String: ");
        String str = scan.nextLine();
        System.out.println(str);

        scan.close();
    }
}
