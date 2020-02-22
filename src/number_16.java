import java.io.*;

public class number_16 {
    public static void main(String[] args) {
        //Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt


        try {
            File file = new File("fileName.txt");
            FileReader fr = new FileReader(file); //поток, который подключается к текстовому файлу
            BufferedReader br = new BufferedReader(fr); //читающий класс

            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //br.close(); WTF
    }
}
