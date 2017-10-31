public class TestForme {
    public static void main(String[] args) {
        Cerchio cerchio1=new Cerchio(3.0,Colore.YELLOW);
        Quadrato quadrato1=new Quadrato(3.0,Colore.BLACK);
        Rettangolo rett1=new Rettangolo(2,5,Colore.BLUE);

        ImgVect img1=new ImgVect(4);
        System.out.println(img1.aggiungiForma(cerchio1));
        System.out.println(img1.aggiungiForma(rett1));
        System.out.println(img1.aggiungiForma(quadrato1));
        System.out.println(img1.aggiungiForma(rett1));
        img1.printElenco();
        System.out.println("");
       /* System.out.println("Somma area degli oggetti di colore "+Colore.RED+" :"+img1.areaColore(Colore.RED));
        System.out.println("Somma area degli oggetti di colore "+Colore.BLUE+" :"+img1.areaColore(Colore.BLUE));
        System.out.println("Somma area degli oggetti di colore "+Colore.YELLOW+" :"+img1.areaColore(Colore.YELLOW));
        System.out.println("Somma area degli oggetti di colore "+Colore.BLACK+" :"+img1.areaColore(Colore.BLACK));
        */
        System.out.println("");
        img1.ordinaForma();
    }
}
