import java.util.Scanner;

public class es {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci una parola: ");
        String s = in.next();
        
        //A
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
        
        //B
        for(int i = 0; i < s.length(); i++) {
            if(i<2 || (i+1)%2==0) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
        
        //C
        String s2 = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            if(s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u') {
                System.out.print('_');
            } else {System.out.print(s.charAt(i));}
        }
        System.out.println();
        
        //D
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u') count++;
        }
        System.out.println(count);
        
        //E
        for(int i = 0; i < s.length(); i++) {
            if(s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u') {
                System.out.print(i);
            }
        }
        System.out.println();
    }
}
