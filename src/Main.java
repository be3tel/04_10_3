import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] array = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите количество дней");
            Scanner scan = new Scanner(System.in);
            String rasxod = scan.nextLine();
            array[i] = rasxod;
        }

        System.out.print ("Вывод элементов:");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + array[i]);
        }
    }
}