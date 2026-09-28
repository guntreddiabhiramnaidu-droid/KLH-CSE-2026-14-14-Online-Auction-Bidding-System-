import java.util.Scanner;

public class ShipCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kg = sc.nextDouble();
        boolean express = sc.next().equals("Y");
        int cost;
        if (kg <= 1.0) cost = express ? 70 : 40;
        else cost = express ? 100 : 60;
        System.out.println("Rs " + cost);
    }
}
