import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNo = scanner.nextInt();
        if (givenNo%2==0){
            System.out.println(givenNo+2);
        }else if (givenNo%2!=0){
            System.out.println(givenNo +1);
        }
    }
}