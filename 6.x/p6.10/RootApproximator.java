/**
 * RootApproximator
 */
public class RootApproximator {
    private double x = 1;
    private double previousx = 0;
    private double a;
    final private double EPSILON;

    public RootApproximator(double a, double EPSILON) {
        this.a = a;
        this.EPSILON = EPSILON;
    }

    public double nextGuess() {
        previousx = x;
        x = (x + (a/x))/2;
        return x;
    }

    public boolean hasMoreGuesses() {
        return Math.abs(x - previousx) > EPSILON;
    }
} 
