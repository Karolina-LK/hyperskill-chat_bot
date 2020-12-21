import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int max =0;
        while (no>0){
            if (no > max)
                max = no;
                no = scanner.nextInt();
        }
        System.out.println(max);
    }
}