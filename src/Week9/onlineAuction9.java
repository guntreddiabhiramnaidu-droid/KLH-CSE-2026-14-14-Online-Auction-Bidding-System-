import java.util.List;

public class onlineAuction9 {
    public static void main(String[] args) {
        ClassroomLot lot = new ClassroomLot("AURORA", 60, "LOCKED");
        List<StateEntry> history = List.of(
                new StateEntry("OPEN"), new StateEntry("MARKER_5"),
                new StateEntry("MARKER_10"), new StateEntry("LOCKED"));

        System.out.println("Lot " + lot.getLabel() + " | " + lot.getPoints() + " pts | " + lot.getState());
        System.out.println("State history entries: " + history.size());
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

        String getLabel() {
            return label;
        }

        int getPoints() {
            return points;
        }

        String getState() {
            return state;
        }
    }

    static class StateEntry {
        private final String state;

        StateEntry(String state) {
            this.state = state;
        }
    }
}
