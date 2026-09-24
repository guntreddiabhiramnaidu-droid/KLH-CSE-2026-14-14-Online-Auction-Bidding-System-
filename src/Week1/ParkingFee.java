import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hours parked: ");
        int hours = sc.nextInt();

        final int FREE = 1, RATE = 20, CAP = 150;
        int chargeable = hours - FREE;
        if (chargeable < 0) chargeable = 0;
        int fee = chargeable * RATE;
        if (fee > CAP) fee = CAP;

        System.out.printf("Hours=%d Chargeable=%d Fee=Rs %d\n", hours, chargeable, fee);
    }
}
