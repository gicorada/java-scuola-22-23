public class PolygonTester {
    public static void main(String[] args) {
        
        Polygon esagono = new Polygon(10, 5, 1);
        esagono.add(14, 1);
        esagono.add(18.5, 8.79);
        esagono.add(14, 16.59);
        esagono.add(5, 16.59);
        esagono.add(0.5, 8.79);

        System.out.println(esagono.perimeter());

        System.out.println(esagono.area());

        System.out.println(esagono.toString());
        

        
        Polygon rettangolo = new Polygon(5, 0, 0);
        rettangolo.add(2, 0);
        rettangolo.add(2, 2);
        rettangolo.add(0, 2);

        System.out.println(rettangolo.perimeter());
        
        System.out.println(rettangolo.area());

        System.out.println(rettangolo.toString());
    }
}