public class Calkowanie {
    private double a;
    private double b;
    private double x0;
    Funkcja f;

    public Calkowanie(double a, double b, double x0, Funkcja f) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.x0 = x0;
    }

    void calka(Krok krok, double h){
        double t = a;
        double x =x0+a/h;
        while(t<b) {
            //System.out.println("t = " + t + "\t x: " + x);
            x = krok.krok(x, t, h, f);
            t += h;
            System.out.println(x);
            //System.out.println(t);
        }
    }
}
