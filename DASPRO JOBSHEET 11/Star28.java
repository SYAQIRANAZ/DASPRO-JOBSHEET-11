import java.util.Scanner;

public class Star28 {
    public static void main(String[] args){
        Scanner sc28 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc28.nextInt();
        for(int i = 1; i<=N; i++){
            System.out.print("*");
        }
    }
}