import javax.sql.rowset.FilteredRowSet;
import java.text.Normalizer;
import java.util.Arrays;

public class ImgVect {
    private Forma Forma[];
    private final int max;
    private int formeInserite;
    public ImgVect(int max){
        this.max=max;
        Forma=new Forma[max];
        formeInserite=0;
    }
    public boolean aggiungiForma(Forma forma){
        if(formeInserite==max) return false;
        else {
            Forma[formeInserite++]=forma;
            return true;
        }
    }
    public double areaTot(){
        double tot=0;
        for (int i=0;i<formeInserite;i++){
            tot+=Forma[i].area();
        }
        return tot;
    }
    public double areaColore(Colore colore){
        double tot=0;
        for (int i=0;i<formeInserite;i++){
            if(Forma[i].getColore().equals(colore)) tot+=Forma[i].area();   //equals o == ?
        }
        return tot;
  }
    public void printElenco(){
        for(int i=0;i<formeInserite;i++){
            System.out.println("Forma "+(i+1)+":    "+Forma[i]+" [Area: "+ Forma[i].area()+"]");
        }
    }
    public void ordinaForma(){
        Arrays.sort(Forma);
        for(int i=0;i<formeInserite;i++){
            System.out.println("Forma "+(i+1)+":    "+Forma[i]+" [Area: "+ Forma[i].area()+"]");

        }

    }
}
