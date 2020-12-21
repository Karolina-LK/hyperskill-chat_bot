import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int max = 0;

        while(scanner.hasNext()&& no<= 30000){
            no = scanner.nextInt();
            if(no> max && no %4==0 && no <10000){
                max = no;
            }
        }
        System.out.println(max);
    }
}