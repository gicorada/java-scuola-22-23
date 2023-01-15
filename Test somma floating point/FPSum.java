public class FPSum {
    public static void main(String[] args) {
        double sum = 0;
        
        for(int i = 0; i < 1000; i++) {
            sum += 1/(double)1000;
        }
        
        System.out.println("Numero teorico: 1");
        System.out.println("Numero reale: " + sum);
    }
}
