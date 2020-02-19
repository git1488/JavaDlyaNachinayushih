import java.util.Scanner;

public class number_13 {
    public static void main(String[] args) {
        //Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
        // Вывести на экран строку с наибольшей длиной.
        // Если длины равны, вывести соответствтующее сообщение.
        Scanner scan = new Scanner(System.in);
        System.out.println("String #1: ");
        String strFirst = scan.nextLine();
        System.out.println("String #2: ");
        String strSecond = scan.nextLine();
        if (strFirst.length() > strSecond.length()){
            System.out.println(strFirst);
        } else if (strFirst.length() < strSecond.length()){
            System.out.println(strSecond);
        } else System.out.println("Длины равны");

        scan.close();
    }

}
