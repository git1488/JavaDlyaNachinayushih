import java.util.Arrays;
import java.util.Scanner;

public class number_9 {
    public static void main(String[] args) {
        //Произведите ввод данных с клавиатуры в массив, а после этого
        // произведите вывод массива на экран, где каждый элемент массива умножается на 2.
        // Размер массива задается пользователем
        Scanner scan = new Scanner(System.in);
        System.out.println("length: ");
        int length = scan.nextInt();
        int numbers[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter elem #" + (i + 1) +":");
            numbers[i] = scan.nextInt();
        }
        for (int i = 0; i < length; i++) System.out.println(numbers[i] * 2);

        scan.close();
    }
}
