// You can experiment here, it won’t be checked

public class Task {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            for (int j = 0; j < 5; j++) {
                System.out.println(j);
                break;
            }
        }
    }
}
