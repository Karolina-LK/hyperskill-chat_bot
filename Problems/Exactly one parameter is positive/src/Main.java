import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();
        int no3 = scanner.nextInt();
        System.out.println((((no1>0&&no2<=0)&&no3<=0)||((no1<=0&&no2>0)&&no3<=0))
                ||(((no1<=0&&no2<=0)&&no3>0)));
    }
}