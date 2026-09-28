public class L4_scope {
    static int twice(int n) {
        int r = n * 2;
        return r;
    } 
    public static void main(String[] a) {
        int r = 5; 
        System.out.println(twice(10) + " and main's r still " + r);
    }
}
