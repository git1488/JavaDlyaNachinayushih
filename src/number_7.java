import java.util.Scanner;

public class number_7 {
    public static void main(String[] args) {
        //Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
        // В программе должны присутствовать константы X, Y, Z.
        // Программа должна сравнивать введенное значение с клавиатуры со значением констант и
        // вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
        // Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"

        Scanner scan = new Scanner(System.in);
        System.out.println("number: \n");
        int number = scan.nextInt();

        final int X=1;
        final int Y=2;
        final int Z=3;

        switch (number){
            case X:
                System.out.println("Данное значение имеется в константах");
                break;
            case Y:
                System.out.println("Данное значение имеется в константах");
                break;
            case Z:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
                break;
        }
    }
}
