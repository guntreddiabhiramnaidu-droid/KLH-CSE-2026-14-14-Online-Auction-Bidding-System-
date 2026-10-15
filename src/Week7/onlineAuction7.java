public class onlineAuction7 {
    public static void main(String[] args) {
        MarkerBoard board = new MarkerBoard(40, false);
        board.addMarker(5);
        board.addMarker(-1);
        board.lock();
        board.addMarker(5);
    }

    static class MarkerBoard {
        private int points;
        private boolean locked;

        MarkerBoard(int points, boolean locked) {
            this.points = points;
            this.locked = locked;
        }

        void addMarker(int marker) {
            if (locked) {
                System.out.println("Locked lot -> marker ignored");
            } else if (marker <= 0) {
                System.out.println("Rejected marker " + marker + " -> points must be positive");
            } else {
                points += marker;
                System.out.println("Accepted marker +" + marker + " -> " + points + " pts");
            }
        }

        void lock() {
            locked = true;
        }
    }
}