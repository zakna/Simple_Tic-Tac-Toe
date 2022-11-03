import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int minimum = array[0];
        for (int i : array) {
            if (i < minimum) {
                minimum = i;
            }
        }
        System.out.println(minimum);

    }
}