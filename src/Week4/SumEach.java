public class SumEach {
    public static void main(String[] args) {
        int[] prices = {40, 70, 55, 100}; 
        int total = 0;
        for (int p : prices) { 
            total += p;
        }
        System.out.println("total = " + total + " over " + prices.length + " items");
    }
}
