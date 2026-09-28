public class Grid {
    public static void main(String[] args) {
        for (int r = 1; r <= 3; r++) { 
            for (int c = 1; c <= 3; c++) { 
                System.out.print(r * c + "\t");
            }
            System.out.println(); 
        }
    }
}
