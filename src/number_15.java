import java.util.Arrays;
import java.util.Scanner;

public class number_15 {
    public static void main(String[] args) {
        //Написать программу сортировки по возрастанию заданного пользователем массива чисел.
        //Использовать пузырьковый метод сортировки.
        Scanner scan = new Scanner(System.in);
        System.out.println("length: ");
        int length = scan.nextInt();

        int numbers[] = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter elem #" + (i + 1) + "}:");
            numbers[i] = scan.nextInt();
        }



        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int tmp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        System.out.print(Arrays.toString(numbers));

        scan.close();
    }
}
