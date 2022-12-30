 /**
  * Tester
  */
 public class Tester {
    public static void main(String[] args) {
        final double EPSILON = 0.0001;
        final double a = 100;
        RootApproximator approx = new RootApproximator(a, EPSILON);
        while (approx.hasMoreGuesses()){ 
            System.out.println(approx.nextGuess());
        }
        System.out.println("^^ Last guess");
    }
    
 }