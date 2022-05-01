import java.util.Scanner;

public class ReverseTriangle {
    public void triangleDraw(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamak sayısı giriniz : ");
        int n = scanner.nextInt();
        for (int i = n-1 ; i >= 0; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
