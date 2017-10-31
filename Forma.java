public abstract class Forma implements Comparable {
    protected Colore colore;
    public Forma (Colore colore){
            this.colore=colore;
    }
    public Colore getColore() {
        return colore;
    }
    public abstract double area();
    public abstract double perimetro();

    @Override
    public int compareTo(Object o) {
        if ((o!=null && (o instanceof Forma))){
            Forma altraForma=(Forma)o;
            return  (int)(area()-altraForma.area());
        }
        return -1;//default
    }
}
