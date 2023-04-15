public class CircuitTester {
    public static void main(String[] args) {
        Serial circuito = new Serial();

        circuito.addCircuit(new Resistor(10));

        Parallel p1 = new Parallel();
        p1.addCircuit(new Resistor(20));
        p1.addCircuit(new Resistor(50));

        circuito.addCircuit(p1);

        System.out.println(circuito.getResistance());
    }
}