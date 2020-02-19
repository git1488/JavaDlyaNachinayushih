import java.util.Scanner;

public class number_12 {
    public static void main(String[] args) {
        //Для введенной с клавиатуры строки необходимо провести отсев пробелов.
        // Результат в виде строки без пробелов вывести на экран.
        Scanner scan = new Scanner(System.in);
        System.out.println("String: ");
        String str = scan.nextLine();
        System.out.println(str.replace(" ", ""));

        scan.close();
    }

}
