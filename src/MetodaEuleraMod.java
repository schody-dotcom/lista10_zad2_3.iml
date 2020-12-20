public class MetodaEuleraMod implements Krok {


    @Override
    public double krok(double x, double t, double h, Funkcja f) {
        //return x+f.f(x,t+0.5)*h;
        return x+f.f((new MetodaEulera()).krok(x,t+h/2, h, f),t+h/2)*h;
    }
}
