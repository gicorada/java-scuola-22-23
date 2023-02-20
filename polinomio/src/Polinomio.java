public class Polinomio {
    private double[] coefficienti;

    public Polinomio(double[] coefficienti) {
        this.coefficienti = coefficienti;
    }

    public double y(double x) {
        double y = 0;
        for (int i = coefficienti.length - 1; i >= 0; i--) {
            y += coefficienti[i] * Math.pow(x, i);
        }

        return y;
    }

    public double[] add(Polinomio other) {
        if(other.coefficienti.length != coefficienti.length) throw new IllegalArgumentException();

        double[] sum = new double[coefficienti.length];

        for (int i = 0; i < coefficienti.length; i++) {
            sum[i] = coefficienti[i] + other.coefficienti[i];
        }

        return sum;
    }

    @Override
    public String toString() {
        String testo = "";
        for (int i = coefficienti.length - 1; i >= 0; i--) {
            if (coefficienti[i] >= 0) {
                testo += "+";
            }
            testo += coefficienti[i] + "x^" + i + " ";
        }

        return testo;
    }
}
