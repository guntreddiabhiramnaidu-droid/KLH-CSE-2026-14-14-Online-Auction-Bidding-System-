public class L5_overload {
    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    static char max(char a, char b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(max(3, 9) + " " + max(4, 1, 7) + " " + max('a', 'z'));
    }
}

