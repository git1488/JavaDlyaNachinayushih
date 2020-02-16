import java.util.Scanner;

public class number_10 {
    public static void main(String[] args) {
        //Произведите ввод данных с клавиатуры в матрицу, а после этого
        // произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
        // Размерность матрицы задается пользователем.
        Scanner scan = new Scanner(System.in);
        System.out.println("length i: \n");
        int lengthi = scan.nextInt();
        System.out.println("length j: \n");
        int lengthj = scan.nextInt();

        int numbers[][] = new int[lengthi][lengthj];

        for (int i=0;i<lengthi;i++) {
            for (int j = 0; j < lengthj; j++) {
                System.out.printf("Enter elem {%d, %d}:\n", i + 1, j + 1);
                numbers[i][j] = scan.nextInt();
            }
        }

        for (int j=0;j<lengthj;j++) System.out.printf("%d ", numbers[0][j]*3);
    }
}
