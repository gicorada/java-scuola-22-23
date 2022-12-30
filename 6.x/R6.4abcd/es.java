public class es {
    public static void main(String[] args) {
        int somma = 0;
        // A
        /*
        for(int i = 2; i<=100; i+=2) {
            somma += i;
        }
        System.out.println(somma);
        */
        
        //B
        /*
        for(int i = 1; i*i<=100; i++) {
            somma += i*i;
        }
        System.out.println(somma);
        */
        
        //C
        /*
        int a = 1;
        int b = 100;
        for(int i=a; i<=b; i++) {
            if(i%2 != 0) {somma+=i;}
        }
        System.out.println(somma);
        */
        
        //D
        /*
        int value = 16384;
        for(int i=1; i <= Integer.toString(value).length(); i++) {
            int cifra = Integer.parseInt(Double.toString(value%(Math.pow(10, i))).substring(0, 1));
            if(cifra % 2 != 0) {
                somma += cifra;
            }
        }
        System.out.println(somma);
        */
    }
}
