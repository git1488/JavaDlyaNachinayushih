import java.io.*;
import java.util.Scanner;

public class number_17 {
    public static void main(String[] args) {
        //Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
        // Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
        // Пользователь при тестировании программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.

        InputStreamReader isr = new InputStreamReader(System.in); //поток ввода с клавы
        BufferedReader br = new BufferedReader(isr); //читающий класс

        try {
            File file = new File("fileName.txt");
            FileWriter fw = new FileWriter(file); //поток, который подключается к текстовому файлу
            BufferedWriter bw = new BufferedWriter(fw); //пишуший класс

            String s;
            while ((s = br.readLine()) != null) {
                if (s.equals("STOP")) break;
                fw.write(s + "\r\n");
            }
            br.close();
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
