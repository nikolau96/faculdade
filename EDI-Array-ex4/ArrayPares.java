
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

    public int somaImpar(){
        for(int i=0; i<ap.getLength(); i++){
            //if(i!=%2){
                //ap.getLenght()++;
            //}
        }
        return 0;    
    }
}
