public class onlineAuction3 {
    public static void main(String[] args) {
        String openState = "OPEN";
        String lockedState = "LOCKED";

        if (openState.equals("OPEN")) {
            System.out.println("OPEN: classroom markers permitted");
        }
        if (lockedState.equals("LOCKED")) {
            System.out.println("LOCKED: classroom markers stopped");
        }
    }
}