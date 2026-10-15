public class onlineAuction6 {
    public static void main(String[] args) {
        String[] labels = {"AURORA", "COMET", "MAPLE"};
        int[] points = {60, 30, 20};
        int cometIndex = findLot(labels, "COMET");
        int unknownIndex = findLot(labels, "UNKNOWN");

        System.out.println("Lot index " + cometIndex + ": " + labels[cometIndex]);
        System.out.println("COMET starting points: " + points[cometIndex]);
        System.out.println("Unknown lot: " + (unknownIndex == -1 ? "not found" : "found"));
    }

    static int findLot(String[] labels, String target) {
        for (int index = 0; index < labels.length; index++) {
            if (labels[index].equals(target)) {
                return index;
            }
        }
        return -1;
    }
}