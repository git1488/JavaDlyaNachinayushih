import java.util.Scanner;

public class number_6 {
    public static void main(String[] args) {
        //Написать программу, которая будет выполнять следующие действия:
        //1. Ввод трех чисел с клавиатуры x, y, z
        Scanner scan = new Scanner(System.in);
        System.out.println("x: \n");
        int x = scan.nextInt();
        System.out.println("y: \n");
        int y = scan.nextInt();
        System.out.println("z: \n");
        int z = scan.nextInt();

        //2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
        double srednee = (double)(x+y+z)/3;
        System.out.printf("Среднее: %f \n", srednee);

        //3. Деление среднего арифметического на 2 без остатка
        int div = (int)srednee/2;
        System.out.printf("Результат деления без остатка: %d \n", div);

        //4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (div > 3) System.out.println("Программа выполнена корректно");
    }
}
