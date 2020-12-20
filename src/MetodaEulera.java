public class MetodaEulera implements Krok {


    @Override
    public double krok(double x, double t, double h, Funkcja f) {
        return x+f.f(x,t)*h;
    }
}
