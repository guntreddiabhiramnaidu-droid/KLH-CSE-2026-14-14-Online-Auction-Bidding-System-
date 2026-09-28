import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, sum = 0;
        while (i <= n) { 
            sum += i;
        }
        System.out.println("sum 1.." + n + " = " + sum);
    }
}