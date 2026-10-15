public class onlineAuction8 {
    public static void main(String[] args) {
        int[] addedMarkers = {5, 10, 5};
        int added = totalMarkers(addedMarkers, 0);
        int finalPoints = 40 + added;

        System.out.println("Recursive added points: " + added);
        System.out.println("Final demo points: " + finalPoints);
    }

    static int totalMarkers(int[] markers, int index) {
        if (index == markers.length) {
            return 0;
        }
        return markers[index] + totalMarkers(markers, index + 1);
    }
}
