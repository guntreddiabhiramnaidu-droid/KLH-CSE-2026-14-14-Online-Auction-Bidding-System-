import java.util.List;


public class onlineAuction12 {
    public static void main(String[] args) {
        List<ClassroomLot> lots = List.of(
                new ClassroomLot("AURORA", 60, "LOCKED"),
                new ClassroomLot("COMET", 45, "LOCKED"),
                new ClassroomLot("MAPLE", 30, "OPEN"));

        long openLots = lots.stream().filter(lot -> lot.state().equals("OPEN")).count();
        long lockedLots = lots.stream().filter(lot -> lot.state().equals("LOCKED")).count();
        ClassroomLot top = lots.stream().max((first, second) -> Integer.compare(first.points(), second.points()))
                .orElseThrow();
        int total = lots.stream().mapToInt(ClassroomLot::points).sum();

        System.out.println("CLASSROOM LOT-STATE REPORT");
        System.out.println("Lots: " + lots.size());
        System.out.println("Open lots: " + openLots);
        System.out.println("Locked lots: " + lockedLots);
        System.out.println("Top board score: " + top.label() + " = " + top.points());
        System.out.println("Total synthetic points: " + total);
    }

    static class ClassroomLot {
        private final String label;
        private final int points;
        private final String state;

        ClassroomLot(String label, int points, String state) {
            this.label = label;
            this.points = points;
            this.state = state;
        }

        String label() {
            return label;
        }

        int points() {
            return points;
        }

        String state() {
            return state;
        }
    }
}