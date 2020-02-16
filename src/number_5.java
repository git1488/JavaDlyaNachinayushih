import java.util.Scanner;


public class number_5 {

    public static void recursion(int ii, int xx) {
        ii++;
        if (ii<=10){
            System.out.printf("%d x %d = %d \n", ii, xx, ii*xx);
            recursion(ii, xx);
        }
    }

    public static void main(String[] args) {
        //Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа.
        // Использовать циклы запрещено.
        Scanner scan = new Scanner(System.in);
        System.out.println("Число: \n");
        int x = scan.nextByte();
        int i = 0;
        recursion(i, x);
    }


}
