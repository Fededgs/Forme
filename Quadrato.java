public class Quadrato extends Forma {
    private double lato;

    public Quadrato (double lato, Colore colore){
        super(colore);
        this.lato=lato;
    }

    public String toString() {
        return "Quadrato di L : "+lato+ " Colore: "+colore;
    }
    @Override
    public double area() {
        return lato*lato;
    }

    @Override
    public double perimetro() {
        return 4*lato;
    }
}
