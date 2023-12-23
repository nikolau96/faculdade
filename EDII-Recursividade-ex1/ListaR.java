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

    public int somaPar(){
        if(inicio!=null){ 
            return inicio.verificaNumero();
        }
        else{
            return 0;
        }
    }

    public char[] verificaNumero() {
        return null;
    }
}
