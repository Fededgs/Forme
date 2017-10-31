class Cerchio extends Forma{
    private double raggio;
    final double pigreco=3.1415;
    public Cerchio(double raggio,Colore colore){
        super(colore);
        this.raggio=raggio;
    }
    @Override
    public String toString() {
        return "Cerchio di R: "+raggio+ " Colore: "+colore;
    }
    @Override
    public double perimetro() {
        return 2*pigreco*raggio;
    }
    @Override
    public double area() {
        return pigreco*raggio*raggio;
    }
}
