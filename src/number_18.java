import java.io.*;

public class number_18 {
    public static void main(String[] args) {
        //Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
        // а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
        // Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.

        InputStreamReader isr = new InputStreamReader(System.in); //поток ввода с клавы
        BufferedReader brIsr = new BufferedReader(isr); //читающий класс

        try {
            File file = new File("fileName.txt");

            //Вывод на экран----------------------------------------------------------------------------------------
            FileReader fr = new FileReader(file);
            BufferedReader brFr = new BufferedReader(fr);

            String s;
            byte rowsCount = 0;
            while ((s = brFr.readLine()) != null) {
                rowsCount++;
                System.out.println(s);
            }
            brFr.close();

            // Считывает с клавы + перезаписывает-------------------------------------------------------------------
            FileWriter fw = new FileWriter(file); //поток, который подключается к текстовому файлу
            BufferedWriter bw = new BufferedWriter(fw); //пишуший класс

            for (int i = 1; i <= rowsCount; i++) {
                System.out.println("[" + i + "/" + rowsCount + "]");
                fw.write(brIsr.readLine() + "\r\n");
            }

            brIsr.close();
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
