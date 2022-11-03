import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parts = scanner.nextInt();
        int[] sequence = new int[parts];
        for (int i = 0; i < parts; i++) {
            sequence[i] = scanner.nextInt();
        }
        int readyForShipping = 0;
        int toBeFixed = 0;
        int rejected = 0;
        for (int seq : sequence) {
            if (seq == 1)
                toBeFixed++;
            if (seq == -1) {
                rejected++;
            }
            if (seq == 0) {
                readyForShipping++;
            }
        }
        System.out.println(readyForShipping + " " + toBeFixed + " " + rejected);
    }
}