import java.util.Scanner;

public class number_4 {
    public static void main(String[] args) {
        //Ввести с консоли число в бинарном формате.
        // Перевести его в десятичный формат, записать в переменную int и вывести на экран.

        Scanner scan = new Scanner(System.in);
        System.out.println("byte=");
        byte x = scan.nextByte();
        int x2int = Integer.parseInt(Byte.toString(x), 2);
        System.out.println(x2int);
    }
}
