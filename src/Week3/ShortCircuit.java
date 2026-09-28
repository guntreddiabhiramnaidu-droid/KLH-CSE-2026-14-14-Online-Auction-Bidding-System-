
public class ShortCircuit {
    public static void main(String[] args) {
        int x = 0;
        if (x != 0 && 10 / x > 2) 
            System.out.println("big");
        else System.out.println("safe");
        boolean ok = (x == 0) || (10 / x > 2);
        System.out.println(ok);
    }
}
