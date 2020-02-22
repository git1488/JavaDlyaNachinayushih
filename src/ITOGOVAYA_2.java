import java.util.Arrays;
import java.util.Scanner;

public class ITOGOVAYA_2 {
    public static void main(String[] args) {
        //Написать программу сортировки по возрастанию заданного пользователем массива чисел.
        // Пользователь программы должен задавать размер массива и наполнять его числами.
        // Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
        Scanner scan = new Scanner(System.in);
        System.out.println("length: ");
        int length = scan.nextInt();

        int numbers[] = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter elem #" + (i + 1) + ":");
            numbers[i] = scan.nextInt();
        }



        for (int i = 0; i < length; i++) {
            int iMin = i;
            for (int j = i + 1; j < length; j++) {
                if (numbers[j] < numbers[iMin]) iMin = j;
            }
            int tmp = numbers[i];
            numbers[i] = numbers[iMin];
            numbers[iMin] = tmp;
        }
        System.out.print(Arrays.toString(numbers));

        scan.close();
    }
}
