public class Rettangolo extends Forma {
    private double altezza;
    private double base;
    public Rettangolo(double altezza,double base, Colore colore){
        super(colore);
        this.altezza=altezza;
        this.base=base;
    }
    public String toString() {
        return "Rettangolo di altezza: "+altezza+" base: "+base+ " Colore: "+colore;
    }
    @Override
    public double area() {
        return base*altezza;
    }

    @Override
    public double perimetro() {
        return 2*(base + altezza);
    }

}
