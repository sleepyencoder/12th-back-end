import java.util.Scanner;

public class inseo_14681 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > 0 & b > 0) {
            System.out.print("1");
        }
        else if(a > 0 & b < 0){
            System.out.print("4");
        }
        else if(a < 0 & b > 0){
            System.out.print("2");
        }
        else{
            System.out.print("3");
        }
        scanner.close();
    }
}
