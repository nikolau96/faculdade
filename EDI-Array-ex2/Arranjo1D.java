
public class Arranjo1D{
    private int x[];
    
    public Arranjo1D(int N){
        x = new int[N];
    }

    public void setSize(int N){
        x = new int[N];
    }
    
    public void setX(int pos, int valor){
        if(pos < x.length){
            x[pos] = valor;
        }
    }
    
    public int getX(int pos){
        if(pos < x.length){
            return x[pos];
        }
        else return -99999;
    }
    
    public int getLength(){
        return x.length;
    }
}
