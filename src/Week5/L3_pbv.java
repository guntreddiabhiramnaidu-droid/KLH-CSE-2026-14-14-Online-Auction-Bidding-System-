public class L3_pbv {
    static void addTax(int price) {
        price = price + price / 10;
    } 
    public static void main(String[] a) {
        int p = 100;
        addTax(p);
        System.out.println("caller still sees p = " + p); 
    }
}
