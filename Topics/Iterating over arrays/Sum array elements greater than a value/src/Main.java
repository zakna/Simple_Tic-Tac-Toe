import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size =  scanner.nextInt();
        int[] array= new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int check = scanner.nextInt();
        int sum = 0;
        for (int input: array) {
            if (input>check)
                sum += input;
        }
        System.out.println(sum);
    }
}