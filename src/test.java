import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        for (int x = 10; x < 15; x=x+1 ){
            System.out.print("Значение x: " + x);
            System.out.print("\n");
        }

        int x = 9;
        do{
            System.out.print("Значение x: " + x);
            x++;
            System.out.print("\n");
        } while (x<14);

        x=10;
        while (x<15){
            System.out.print("Значение x: " + x);
            x++;
            System.out.print("\n");
        }
        int [] numbers = {10, 20, 30, 40, 50};

        for(int y : numbers ) {
            if (y == 30) {
                break;
            }
            System.out.print(y);
            System.out.print("\n");
        }


    }
}
