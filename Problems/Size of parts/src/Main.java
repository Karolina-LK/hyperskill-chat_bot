import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int detector = scanner.nextInt();
        int effect;
        int largerPart = 0;
        int smallerPart = 0;
        int perfectPart = 0;

        for (int i = 1; i <= detector; i++) {
            effect = scanner.nextInt();
            if (effect == 1) {
                largerPart++;
            } else if (effect == -1) {
                smallerPart++;
            } else if (effect == 0) {
                perfectPart++;
            }
        }
        System.out.println(perfectPart+ " "+ largerPart+ " "+ smallerPart);
    }
}