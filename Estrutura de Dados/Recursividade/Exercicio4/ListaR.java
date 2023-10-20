
public class ListaR{
    private NodeR inicio;
    
    public ListaR(){
       inicio = null; 
    }
    
    public void add(int valor){
        if(inicio!=null){
            inicio.add(valor);
        }
        else{
            inicio = new NodeR(valor);
        }
        
    }
    
    public int menorMaior(int y){
        if(inicio!=null){
            return inicio.menorMaior(y);
        }
        else{
            return 0;
        }
    }
}
