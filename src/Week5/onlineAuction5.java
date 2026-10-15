public class onlineAuction5 {
    public static void main(String[] args) {
        int points = 40;
        points = addPoints(points, 5);
        System.out.println("After +5: " + points + " pts");
        points = addPoints(points, 10);
        System.out.println("After +10: " + points + " pts");
        showLot("AURORA", "OPEN");
    }

    static int addPoints(int current, int added) {
        return current + added;
    }

    static void showLot(String label, String state) {
        System.out.println("Label: " + label + " | State: " + state);
    }
}