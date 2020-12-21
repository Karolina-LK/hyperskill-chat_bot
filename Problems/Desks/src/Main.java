import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
        int result1;
        int result2;
        int result3;

        if ((group1  % 2) == 0) {
            result1 = group1/2;
        } else {
            result1 = ((group1 / 2) + 1);
        }

        if ((group2 % 2) == 0) {

            result2= (group2/2);
        } else {
            result2= ((group2 / 2) + 1);
        }

        if ((group3 % 2) == 0) {

            result3=(group3/2);
        } else {
            result3=(group3/2 + 1);
        }

        System.out.println( result1+ result2+ result3);
    }
}