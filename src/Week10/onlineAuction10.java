public class onlineAuction10 {
    public static void main(String[] args) {
        try {
            validateState("OPEN");
            System.out.println("Accepted state: OPEN");
        } catch (InvalidClassroomStateException exception) {
            throw new IllegalStateException(exception);
        }

        try {
            validateState("PAUSED");
        } catch (InvalidClassroomStateException exception) {
            System.out.println("Rejected state: PAUSED");
            System.out.println("Reason: " + exception.getMessage());
        }
    }

    static void validateState(String state) throws InvalidClassroomStateException {
        if (!state.equals("OPEN") && !state.equals("LOCKED")) {
            throw new InvalidClassroomStateException("Unsupported classroom state");
        }
    }

    static class InvalidClassroomStateException extends Exception {
        InvalidClassroomStateException(String message) {
            super(message);
        }
    }
}