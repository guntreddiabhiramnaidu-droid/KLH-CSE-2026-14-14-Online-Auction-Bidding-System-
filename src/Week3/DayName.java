import java.util.Scanner;

public class DayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        String name;
        switch (d) {

            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
                
            case 6: 

            case 7:
                name = "Weekend";
                break;
            default:
                name = "invalid";
        }
        System.out.println(name);
    }
}