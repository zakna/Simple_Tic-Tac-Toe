import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int counter = 0;
        for (int i : array) {
            if (i == n) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}