import java.util.Scanner;


public class number_5 {

    private static void recursion(int i, int number) {
        i++;
        if (i <= 10){
            System.out.println(i + " x " + number + " = " + i * number);
            recursion(i, number);
        }
    }

    public static void main(String[] args) {
        //Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа.
        // Использовать циклы запрещено.
        Scanner scan = new Scanner(System.in);
        System.out.println("Число: ");
        int number = scan.nextInt();

        recursion(0, number);

        scan.close();
    }

}
