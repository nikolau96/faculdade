
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

    public int procuraNumero(){
        for(int i=0; i<ap.getLength(); i++){
            //if(i==ap.setX()){
                //return ap.setX();
            //}
        }
        return -1;    
    }
}
