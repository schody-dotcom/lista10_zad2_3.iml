public class Main {
    public static void main(String[] args) {

        Funkcja funkcja = (x,t) -> -2*t*t*t+12*t*t-20*t+8.5;
        Funkcja funkcja1 = (x,t) -> -30/(1-t*t)+2*t/(1-t*t)*x-x*x;

        Calkowanie calkowanie = new Calkowanie(0.01,0.5,19.53,funkcja1);
        calkowanie.calka((new MetodaEulera()), 0.01 );
        //calkowanie.calka((new MetodaEuleraMod()), 0.01 );

    }
}
