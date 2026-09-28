public class L1_Method {
    static int area(int w, int h) {
        return w * h;
    }

    public static void main(String[] a) {
        int floor = area(4, 3);
        int wall = area(5, 2);
        System.out.println("floor=" + floor + " wall=" + wall + " total=" + (floor + wall));
    }
}
