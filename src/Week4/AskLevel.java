import java.util.Scanner;

public class AskLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int level;
        do {
            level = sc.nextInt();
        } while (level < 1 || level > 5); 
        System.out.println("accepted level " + level);
    }
}
