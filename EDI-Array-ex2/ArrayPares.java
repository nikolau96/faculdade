
public class ArrayPares{
    private Arranjo1D ap;

    public ArrayPares(int N){
        ap = new Arranjo1D(N);
    }
    
    public void preenche(){
        for(int i=0; i<ap.getLength(); i++){
            ap.setX(i, (i+1)*2);
        }
    }

    public void mostra(){
       for(int i=0; i<ap.getLength(); i++){
            System.out.print("  x["+i+"] = " + ap.getX(i));
        } 
    }

    public int separaPositivoNegativo(){
        for(int i=0; i<ap.getLength(); i++){
            if(i<0){
                /*public void novoArranjo(int N){
                    x = new int[N];
                }
                public int getLength(){
                    return y.length;
                }*/
            }
        }
        return 0;    
    }
}
