import java.util.Scanner;

public class Triangle28 {

    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc28.nextInt();
        int i = 0;
        while (i<=N) {
            int j = 1; 
            while(j<=i){
                System.out.print("*");
                j++;
            }
            i++;
        }
    }
}